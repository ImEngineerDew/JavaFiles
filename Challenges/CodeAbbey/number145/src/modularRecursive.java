import java.util.Scanner;
public class modularRecursive {
  public static void main(String args[])
  {
    Scanner object = new Scanner(System.in);
    Integer size = object.nextInt();

    Long base[] = new Long[size];
    Long exp[] = new Long[base.length];
    Long module[] = new Long[base.length];

    readVector(base,exp,module,object,0);
   }

  public static void readVector(Integer vecA[],Integer vecB[],Integer vecC[],Scanner sc, Integer index)
  {
    if(!index.equals(vecA.length))
    {
      System.out.println("Please write the number in the vectorA: ");
      vecA[index] = sc.nextInt();
      System.out.println("Please write the number in the vectorB: ");
      vecB[index] = sc.nextInt();
      System.out.println("Please write the number in the vectorC: ");
      vecC[index] = sc.nextInt();

      readVector(vecA,vecB,vecC,sc,index+1);
    }
  }

  public static Long[] modularCalculator(Long base[],Long exp[],Long module[],Integer index)
  {

  }


  public static Long calculateModular(Long base, Long exp, Long module) {
    if (module == 1) {
      return 0L;
    }
    if (exp == 0) {
      return 1L;
    }
    Long temporal = calculateModular(base, exp / 2, module);
    Long result = ((long) Math.pow(temporal, 2) % module);

    if (exp % 2 == 1) {
      result = (result * base) % module;
    }
    System.out.println(temporal);
    return result;
  }
}