import java.util.Arrays;
import java.util.Scanner;

public class recursivePythagorean {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);
    System.out.print("Write the size of your array: ");
    int size = object.nextInt();

    Long pythagoras[] = new Long[size];
    readVector(pythagoras,object,0);
    System.out.println(Arrays.toString(pythagoras));
  }
  public static void readVector(Long vec[],Scanner sc, Integer index){
    if(!index.equals(vec.length))
    {
      long s = sc.nextLong();
      vec[index] = calculateSquaresAux(s,1,2);
      readVector(vec,sc,index+1);
    }
  }
  
  public static long calculateSquaresAux(long s, long m, long n) {
    if (m>=Math.sqrt(s)) {
      return 0;
    }
    if (n>=m) {
      return calculateSquaresAux(s,m+1,1);
    }
    long a = (int)Math.pow(m,2) - n * n;
    long b = 2 * m * n;
    long c =((int)Math.pow(m,2)) + ((int)Math.pow(n,2));

    if (a + b + c == s) {
      //System.out.println(a + " " + b + " " + c);
      long cSquared = (int)Math.pow(c,2);
      return cSquared;
    }
    return calculateSquaresAux(s,m,n+1);
  }
}
