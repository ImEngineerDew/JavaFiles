import java.security.SecureRandom;
import java.util.Scanner;
import java.math.BigInteger;

public class testingRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    System.out.print("Please write the size of your array: ");

    Integer size = object.nextInt();
    BigInteger arrayBigs[] = new BigInteger[size];
    readBigs(arrayBigs, object, 0);
    showBigs(arrayBigs, 0);
  }

  public static void readBigs(BigInteger vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {
      //System.out.print("Write your numbers to evaluate: ");
      vec[index] = sc.nextBigInteger();
      readBigs(vec, sc, index + 1);
    }
  }

  public static void showBigs(BigInteger vec[], Integer index) {
    if (!index.equals(vec.length)) {
      BigInteger result = Omirp(vec[index]);
      System.out.println(result);
      showBigs(vec, index + 1);
    }
  }

  public static BigInteger Omirp(BigInteger number) {
    BigInteger answer = isPrime(number);
    return answer;
  }

  public static void whileOne(BigInteger d, int s) {
    if (d.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
      d = d.divide(BigInteger.valueOf(2));
      whileOne(d, s + 1);
    }
  }

  public static BigInteger whileTwo(BigInteger cd, int ct, SecureRandom rnd) {
    if (miller(cd, ct, rnd)) {
      return isOmirp(cd);
    }
    cd = cd.nextProbablePrime();
    return whileTwo(cd, ct, rnd);
  }

  public static BigInteger isPrime(BigInteger number) {
    SecureRandom rand = new SecureRandom();
    if (number.compareTo(BigInteger.ONE) <= 0) {
      return BigInteger.ZERO;
    }
    if (number.compareTo(BigInteger.valueOf(3)) <= 0) {
      return BigInteger.ONE;
    }
    int certainly = 10;
    if (miller(number, certainly, rand)) {
      return isOmirp(number);
    } else {
      BigInteger next = number.nextProbablePrime();
      if (miller(next, certainly, rand)) {
        return isOmirp(next);
      } else {
        BigInteger candidate = number.add(BigInteger.ONE);
        /** Here is placed a second recursive while **/
        return whileTwo(candidate, certainly, rand);
      }
    }
  }
  public static boolean firstLoop(int k, BigInteger d, BigInteger n, int sValue, SecureRandom rand, int i) {
    if (i >= k) {
      return true;
    }
    BigInteger a = new BigInteger(n.bitLength(), rand);
    a = a.mod(n.subtract(BigInteger.valueOf(3))).add(BigInteger.valueOf(2));
    BigInteger x = a.modPow(d, n);

    if (x.equals(BigInteger.ONE) || x.equals(n.subtract(BigInteger.ONE))) {
      return firstLoop(k, d, n, sValue, rand, i + 1);
    }
    boolean composite = true;
    for (int j = 0; j < sValue - 1; j++) {
      x = x.modPow(BigInteger.valueOf(2), n);
      if (x.equals(BigInteger.ONE)) {
        return false;
      }
      if (x.equals(n.subtract(BigInteger.ONE))) {
        composite = false;
        break;
      }
    }
    if (composite) {
      return false;
    }
    return firstLoop(k, d, n, sValue, rand, i + 1);
  }

  /**This method is a perfect analog of the Java predesigned method isProbablePrime **/
  public static boolean miller(BigInteger n, int k, SecureRandom rand) {
    if (n.compareTo(BigInteger.valueOf(2)) < 0) {
      return false;
    }
    if ((n.compareTo(BigInteger.valueOf(2)) == 0 || n.compareTo(BigInteger.valueOf(3)) == 0)) {
      return true;
    }
    if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
      return false;
    }
    /** Here is placed a first recursive while **/
    BigInteger d = n.subtract(BigInteger.ONE);
    int sValue = 0;
    whileOne(d, sValue);

    boolean isPrime = firstLoop(k, d, n, sValue, rand, 0);
    return isPrime;
  }

  public static BigInteger isOmirp(BigInteger primeNum) {
    boolean checkIsOmirp = checkIsPrime(primeNum);
    if (checkIsOmirp) {
      return primeNum;
    } else {
      return isPrime(primeIfs(primeNum.nextProbablePrime()));
    }
  }

  public static boolean checkIsPrime(BigInteger number) {
    SecureRandom rand = new SecureRandom();
    BigInteger emirp = new BigInteger(new StringBuilder(number.toString()).reverse().toString());
    if (emirp.compareTo(BigInteger.ONE) <= 0) {
      return false;
    }
    if (emirp.compareTo(BigInteger.valueOf(3)) <= 0) {
      return true;
    }
    int certainly = 10;
    return miller(emirp, certainly, rand);
  }

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