import java.math.BigInteger;
import java.util.Scanner;

public class recursivePrimes {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    System.out.print("Please write the size of your array: ");

    Integer size = object.nextInt();
    BigInteger arrayBigs[] = new BigInteger[size];
    readBigsVector(arrayBigs, object, 0);  //readVector starting here
    showBigsVector(arrayBigs, 0);
  }

  public static void readBigsVector(BigInteger vec[], Scanner sc, int i) {
    if (i < vec.length) {
      //System.out.print("Write your numbers to evaluate: ");
      vec[i] = sc.nextBigInteger();
      readBigsVector(vec, sc, i + 1);
    }
  }

  public static void showBigsVector(BigInteger vec[], int i) {
    if (i < vec.length) {
      BigInteger result = oMirp(vec[i]);
      System.out.println(result);
      showBigsVector(vec, i + 1);
    }
  }

  public static BigInteger oMirp(BigInteger number) {
    BigInteger answer = isPrime(number);
    return answer;
  }

  /**
   * Check if the number typed by keyboard is a prime or not
   **/
  public static BigInteger isPrime(BigInteger number) {
    boolean checkIsPrime = number.isProbablePrime(10);
    if (checkIsPrime) {
      return isOmirp(number);
    } else {
      return isPrime(number.nextProbablePrime());
    }
  }

  /**
   * Check if the number typed by keyboard is an omrip or not
   **/
  public static BigInteger isOmirp(BigInteger primeNum) {
    BigInteger emirp = new BigInteger(new StringBuilder(primeNum.toString()).reverse().toString());
    boolean checkIsOmirp = emirp.isProbablePrime(10);
    if (checkIsOmirp) {
      return primeNum;
    } else {
      return isPrime(primeIfs(primeNum.nextProbablePrime()));
    }
  }

  public static BigInteger primeIfs(BigInteger primeNum) {
    char firstDigit = primeNum.toString().charAt(0);
    if (firstDigit == '2') {
      return new BigInteger("30000000000000000000047");
    } else if (firstDigit == '4' || firstDigit == '5' || firstDigit == '6') {
      return new BigInteger("70000000000000000000859");
    } else if (firstDigit == '8') {
      return new BigInteger("90000000000000000000001");
    }
    else
    {
      return primeNum;
    }
  }
}