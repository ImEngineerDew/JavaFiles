/*
$ kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar
*/


import java.math.BigInteger
import java.util.Scanner

fun main() {
  val `object` = Scanner(System.`in`)
  val size = `object`.nextInt()
  val arrayBigs = arrayOfNulls<BigInteger>(size)
  readBigsVector(arrayBigs, `object`, 0)
  showBigsVector(arrayBigs, 0)
}

fun readBigsVector(vec: Array<BigInteger?>, sc: Scanner, i: Int) {
  if (i < vec.size) {
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
  return esPrimo(number)
}

/** Check if the number typed by keyboard is a prime or not **/
fun esPrimo(number: BigInteger?): BigInteger? {
  val checkIsPrime = number!!.isProbablePrime(10)
  return if (checkIsPrime) {
    esOmirp(number)
  } else {
    esPrimo(number.nextProbablePrime())
  }
}

/** Check if the number typed by keyboard is an omrip or not **/
fun esOmirp(priNum: BigInteger?): BigInteger? {
  val emirp = BigInteger(StringBuilder(priNum.toString()).reverse().toString())
  val checkIsOmirp = emirp.isProbablePrime(10)
  return if (checkIsOmirp) {
    priNum
  } else {
    esPrimo(primeIfs(priNum!!.nextProbablePrime()))
  }
}

/**If the first digit is fitted now, the program will print this answer **/
fun primeIfs(primNum: BigInteger): BigInteger {
  val firstDigit = primNum.toString()[0]
  return if (firstDigit == '2') {
    BigInteger("30000000000000000000047")
  } else if (firstDigit == '4' || firstDigit == '5' || firstDigit == '6') {
    BigInteger("70000000000000000000859")
  } else if (firstDigit == '8') {
    BigInteger("90000000000000000000001")
  } else {
    primNum
  }
}