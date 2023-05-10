import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;

public class bigIntegersDef {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);
    System.out.println("Please write the size of your array: ");
    int size = object.nextInt();

    BigInteger[] arrayBig = new BigInteger[size];
    readBigVectors(arrayBig, object, 0);
    showBigVector(arrayBig, 0);
  }
  /** Method that read and storage the values of this vector **/
  public static void readBigVectors(BigInteger[] vec, Scanner sc, Integer i) {
    if (i < vec.length) {
      vec[i] = sc.nextBigInteger();
      readBigVectors(vec, sc, i + 1);
    }
  }
  /** Method that show the number storage of that vector **/
  public static void showBigVector(BigInteger[] vec, Integer i) {
    if (i < vec.length) {
      BigInteger result = oMirp(vec[i]);
      System.out.println(result);
      showBigVector(vec, i + 1);
    }
  }

  /** This method can convert the BigInt and reverse it **/
  public static String backwardsString (String number){
     StringBuilder backwards = new StringBuilder();

     for (int i= number.length()-1; i>=0;i--){
       backwards.append(number.charAt(i));
     }
     return backwards.toString();
  }

  public static int divideAndCount(BigInteger d, Integer rValue) {
    if (!d.mod(BigInteger.TWO).equals(BigInteger.ZERO)) { //d%2 != 0
      return rValue;
    }
    BigInteger newD = d.divide(BigInteger.TWO);
    return divideAndCount(newD, rValue + 1);
  }

  public static BigInteger generates(BigInteger edge, Random rnd) {
    BigInteger res = new BigInteger(edge.bitLength(), rnd);
    if (res.compareTo(edge) < 0) {
      return res;
    } else {
      return generates(edge, rnd);
    }
  }

  public static boolean perfomIterations(int confidence, BigInteger number, BigInteger d, int rValue, int i) {
    if (i >= confidence) {
      return true;
    }
    BigInteger aValue = generateRand(number.subtract(BigInteger.TWO));
    BigInteger xValue = aValue.modPow(d, number);

    if (xValue.equals(BigInteger.ONE) || xValue.equals(number.subtract(BigInteger.ONE))) {
      return perfomIterations(confidence, number, d, rValue, i + 1);
    }
    boolean isWitness = false;
    for (int j = 0; j < rValue - 1; j++) {
      if (xValue.equals(BigInteger.ONE)) {
        return false;
      }
      if (xValue.equals(number.subtract(BigInteger.ONE))) {
        isWitness = true;
        break;
      }
    }
    if (!isWitness) {
      return false;
    }
    return perfomIterations(confidence, number, d, rValue, i + 1);
  }

  public static boolean isProbablePrime(BigInteger number, int confidence) {
    if (number.equals(BigInteger.TWO) || number.equals(BigInteger.valueOf(3))) {
      return true;
    }
    if (number.compareTo(BigInteger.TWO) < 0 || number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      return false;
    }
    int rValue = 0;
    BigInteger d = number.subtract(BigInteger.ONE);

    /* Calling this recursion method **/
    divideAndCount(d, rValue);
    /* Calling this recursion for **/
    return perfomIterations(confidence, number, d, rValue, 0);
  }

  /** Generate random values **/
  private static BigInteger generateRand(BigInteger edge) {
    Random rnd = new Random();
    /* Instead of do-while**/
    return generates(edge, rnd);
  }

  public static BigInteger findNextProbablePrime(BigInteger number) {
    if (isProbablePrime(number, 10)) {
      return number;
    } else {
      return findNextProbablePrime(number.add(BigInteger.TWO));
    }
  }

  public static BigInteger nextProbablePrime(BigInteger number) {
    if (number.compareTo(BigInteger.TWO) < 0) {
      return BigInteger.TWO;
    }
    if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      number = number.add(BigInteger.ONE); /* This is a counter**/
    } else {
      number = number.add(BigInteger.TWO); /* Another counter**/
    }
    findNextProbablePrime(number);
    return number;
  }

  public static BigInteger oMirp(BigInteger number) {
    return isPrime(number);
  }
  /** Checking if the number typed by keyboard is prime or not**/
  public static BigInteger isPrime(BigInteger number) {
    boolean checkIsPrime = isProbablePrime(number, 10);
    if (checkIsPrime) {
      return isOmirp(number);
    } else {
      return isPrime(nextProbablePrime(number));
    }
  }
  /** Check if the number has an Omirp **/
  public static BigInteger isOmirp(BigInteger primeNum) {
    BigInteger omirp = new BigInteger(new StringBuilder(primeNum.toString()).reverse().toString());
    boolean checkIsOmirp = isProbablePrime(omirp, 10);
    if (checkIsOmirp) {
      return primeNum;
    } else {
      return isPrime(primeIfs(nextProbablePrime(primeNum)));
    }
  }
  /** Checking with those conditionals **/
  public static BigInteger primeIfs(BigInteger primeNum) {
    char firstDigit = primeNum.toString().charAt(0);
    if (firstDigit == '2') {
      return new BigInteger("30000000000000000000047");
    } else if (firstDigit == '4' || firstDigit == '5' || firstDigit == '6') {
      return new BigInteger("70000000000000000000859");
    } else if (firstDigit == '8') {
      return new BigInteger("90000000000000000000001");
    } else {
      return primeNum;
    }
  }
}