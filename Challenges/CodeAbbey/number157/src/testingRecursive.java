import java.security.SecureRandom;
import java.util.Scanner;
import java.math.BigInteger;

public class testingRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    System.out.print("Please write the size of your array: ");

    Integer size = object.nextInt();
    BigInteger arrayBigs[] = new BigInteger[size];
    readBig(arrayBigs, object, 0);
    showBig(arrayBigs, 0);
  }

  public static void readBig(BigInteger vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {
      //System.out.print("Write your numbers to evaluate: ");
      vec[index] = sc.nextBigInteger();
      readBig(vec, sc, index + 1);
    }
  }

  public static void showBig(BigInteger vec[], Integer index) {
    if (!index.equals(vec.length)) {
      BigInteger result = Omirp(vec[index]);
      System.out.println(result);
      showBig(vec, index + 1);
    }
  }

  public static BigInteger Omirp(BigInteger number) {
    BigInteger answer = isPrime(number);
    return answer;
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
        while (true) {
          if (miller(candidate, certainly, rand)) {
            return isOmirp(candidate);
          }
          candidate = candidate.nextProbablePrime();
        }
      }
    }
  }

  public static void firstWhileRec(BigInteger d, int s) {
    if (s <= 0) {
      return;
    } else if (d.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
      d = d.divide(BigInteger.valueOf(2));
      firstWhileRec(d, s + 1);
    }
  }

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
    firstWhileRec(d, sValue);

    for (int i = 0; i < k; i++) {
      BigInteger a = new BigInteger(n.bitLength(), rand);
      a = a.mod(n.subtract(BigInteger.valueOf(3))).add(BigInteger.valueOf(2));
      BigInteger x = a.modPow(d, n);
      if (x.equals(BigInteger.ONE) || x.equals(n.subtract(BigInteger.ONE))) {
        continue;
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
    }
    return true;
  }

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
    } else {
      return primeNum;
    }
  }
}