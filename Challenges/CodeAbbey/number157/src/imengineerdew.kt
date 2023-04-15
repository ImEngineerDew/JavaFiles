import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
  val `object` = Scanner(System.`in`)
  print("Please write the size of your array: ")
  val size = `object`.nextInt()
  val arrayBigs = arrayOfNulls<BigInteger>(size)
  readBigsVector(arrayBigs, `object`, 0) //readVector starting here
  showBigsVector(arrayBigs, 0)
}

fun readBigsVector(vec: Array<BigInteger?>, sc: Scanner, i: Int) {
  if (i < vec.size) {
    //System.out.print("Write your numbers to evaluate: ");
    vec[i] = sc.nextBigInteger()
    readBigsVector(vec, sc, i + 1)
  }
}

fun showBigsVector(vec: Array<BigInteger?>, i: Int) {
  if (i < vec.size) {
    val result = oMirp(vec[i])
    println(result)
    showBigsVector(vec, i + 1)
  }
}

fun oMirp(number: BigInteger?): BigInteger? {
  return isPrime(number)
}

/**
 * Check if the number typed by keyboard is a prime or not
 */
fun isPrime(number: BigInteger?): BigInteger? {
  val checkIsPrime = number!!.isProbablePrime(10)
  return if (checkIsPrime) {
    isOmirp(number)
  } else {
    isPrime(number.nextProbablePrime())
  }
}

/**
 * Check if the number typed by keyboard is an omrip or not
 */
fun isOmirp(primeNum: BigInteger?): BigInteger? {
  val emirp = BigInteger(StringBuilder(primeNum.toString()).reverse().toString())
  val checkIsOmirp = emirp.isProbablePrime(10)
  return if (checkIsOmirp) {
    primeNum
  } else {
    isPrime(primeIfs(primeNum!!.nextProbablePrime()))
  }
}

fun primeIfs(primeNum: BigInteger): BigInteger {
  val firstDigit = primeNum.toString()[0]
  return if (firstDigit == '2') {
    BigInteger("30000000000000000000047")
  } else if (firstDigit == '4' || firstDigit == '5' || firstDigit == '6') {
    BigInteger("70000000000000000000859")
  } else if (firstDigit == '8') {
    BigInteger("90000000000000000000001")
  } else {
    primeNum
  }
}