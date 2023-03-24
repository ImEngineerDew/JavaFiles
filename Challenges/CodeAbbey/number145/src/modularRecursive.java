import java.util.Scanner;
public class modularRecursive {
  public static void main(String args[])
  {
    //Long res = calculateModular(14L,28L,219431273L);
    System.out.println(res);
  }

  public static void readVector(Integer vecA[],Integer vecB[],Integer vecC[],Scanner sc, Integer index)
  {
    if(!index.equals(vecA.length))
    {
      System.out.println("Please write the number in the position"+index+": ");
      vecA[index] = sc.nextInt();
      

    }
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
