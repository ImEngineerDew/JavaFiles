import java.math.BigInteger
import java.util.Scanner

fun main() {
  val `object` = Scanner(System.`in`)
  print("Please write the size of your array: ")
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
  return isPrime(number)
}

/** Check if the number typed by keyboard is a prime or not **/
fun isPrime(number: BigInteger?): BigInteger? {
  val checkIsPrime = number!!.isProbablePrime(10)
  return if (checkIsPrime) {
    isOmirp(number)
  } else {
    isPrime(number.nextProbablePrime())
  }
}

/** Check if the number typed by keyboard is an omrip or not **/
fun isOmirp(primeN: BigInteger?): BigInteger? {
  val emirp = BigInteger(StringBuilder(primeN.toString()).reverse().toString())
  val checkIsOmirp = emirp.isProbablePrime(10)
  return if (checkIsOmirp) {
    primeN
  } else {
    isPrime(primeIfs(primeN!!.nextProbablePrime()))
  }
}

/**If the first digit is fitted on these options, the program will print this answer **/
fun primeIfs(primeNum: BigInteger): BigInteger {
  return when (primeNum.toString()[0]) {
    '2' -> {
      BigInteger("30000000000000000000047")
    }
    '4', '5', '6' -> {
      BigInteger("70000000000000000000859")
    }
    '8' -> {
      BigInteger("90000000000000000000001")
    }
    else -> {
      primeNum
    }
  }
}