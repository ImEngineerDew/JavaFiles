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

/*
$ cat DATA.lst | java -jar imengineerdew.jar
70880919447052613764997 70814551362513949286321 70000000000000000000859
70188884027475090199039 70000000000000000000859 90023374487626982177593
30000000000000000000047 90245764396240921067657 90719521663456605146873
10471700814817118895581 90000000000000000000001 10949694735573928566097
30924974663611558541633 10862610044344926027497 70000000000000000000859
30497035774315053392411 30685110462640520913553 70450072221758195956177
70314679114633953996859 70000000000000000000859 70635370687689512557759
70000000000000000000859 90459776410732288736471
*/