import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;

public class bigIntegersDef {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    System.out.println("Please write the size of your array: ");
    Integer size = object.nextInt();

    BigInteger arrayBigs[] = new BigInteger[size];
    readBigVectors(arrayBigs,object,0);
    showBigsVector(arrayBigs,0);

  }

  public static void readBigVectors(BigInteger vec[], Scanner sc, Integer i) {
    if (i < vec.length) {
      vec[i] = sc.nextBigInteger();
      readBigVectors(vec, sc, i + 1);
    }
  }

  public static void showBigsVector(BigInteger vec[], Integer i) {
    if (i < vec.length) {
      BigInteger result = oMirp(vec[i]);
      System.out.println(result);
      showBigsVector(vec, i + 1);
    }
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
    while (d.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      d = d.divide(BigInteger.TWO);
      rValue++;
    }
    for (int i = 0; i < confidence; i++) {
      BigInteger aValue = generateRand(number.subtract(BigInteger.TWO));
      BigInteger xValue = aValue.modPow(d, number);

      if (xValue.equals(BigInteger.ONE) || xValue.equals(number.subtract(BigInteger.ONE))) {
        continue;
      }

      boolean isWitness = false;
      for (int j = 0; j < rValue - 1; j++) {
        xValue = xValue.modPow(BigInteger.TWO, number);
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
    }
    return true;
  }

  private static BigInteger generateRand(BigInteger edge) {
    Random rnd = new Random();
    BigInteger result;
    do {
      result = new BigInteger(edge.bitLength(), rnd);
    } while (result.compareTo(edge) >= 0);
    return result;
  }

  public static BigInteger nextProbablePrime(BigInteger number) {
    if (number.compareTo(BigInteger.TWO) < 0) {
      return BigInteger.TWO;
    }
    if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      number = number.add(BigInteger.ONE); /** This is a counter**/
    } else {
      number = number.add(BigInteger.TWO); /** Another counter**/
    }
    while (!isProbablePrime(number, 10)) {
      number = number.add(BigInteger.TWO);
    }
    return number;
  }
  public static BigInteger oMirp (BigInteger number)
  {
    BigInteger  answer = isPrime(number);
    return answer;
  }
  public static BigInteger isPrime(BigInteger number){
    boolean checkIsPrime = isProbablePrime(number,10);
    if(checkIsPrime){
      return isOmirp(number);
    }
    else{
      return isPrime(nextProbablePrime(number));
    }
  }

  public static BigInteger isOmirp(BigInteger primeNum){
    BigInteger omirp = new BigInteger(new StringBuilder(primeNum.toString()).reverse().toString());
    boolean checkIsOmirp =isProbablePrime(omirp,10);
    if(checkIsOmirp){
      return primeNum;
    }else {
      return isPrime(primeIfs(nextProbablePrime(primeNum)));
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
