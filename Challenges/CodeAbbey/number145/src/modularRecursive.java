import java.util.Scanner;

public class modularRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer size = object.nextInt();

    Long base[] = new Long[size];
    Long exp[] = new Long[base.length];
    Long module[] = new Long[base.length];

    readVector(base, exp, module, object, 0);
    Long calculateModule[] = modularCalculator(base, exp, module, 0);
    showResults(calculateModule,0);
  }

  public static void readVector(Long vecA[], Long vecB[], Long vecC[], Scanner sc, Integer index) {
    if (!index.equals(vecA.length)) {
      System.out.print("Please write the base: ");
      vecA[index] = sc.nextLong();
      System.out.print("Please write the exp: ");
      vecB[index] = sc.nextLong();
      System.out.print("Please write the module number: ");
      vecC[index] = sc.nextLong();

      readVector(vecA, vecB, vecC, sc, index + 1);
    }
  }

  public static void showResults(Long result[], Integer index) {
    if(!index.equals(result.length))
    {
      System.out.println(result[index]+" ");
      showResults(result,index+1);
    }
  }

  public static Long[] modularCalculator(Long base[], Long exp[], Long module[], Integer index) {
    if (index == base.length) {
      return new Long[base.length];
    }
    Long moduleC[] = modularCalculator(base, exp, module, index + 1);
    moduleC[index] = calculateModular(base[index], exp[index], module[index]);
    return moduleC;
  }

  public static Long calculateModular(Long base, Long exp, Long module) {
    if (module == 1) {
      return 0L;
    }
    if (exp == 0) {
      return 1L;
    }
    Long temporal = calculateModular(base, exp / 2, module);
    Long result = ((temporal*temporal) % module);

    if (exp % 2 == 1) {
      result = (result * base) % module;
    }
    return result;
  }
}