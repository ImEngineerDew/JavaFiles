/* kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar */

import java.math.BigDecimal
import java.math.BigInteger
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

typealias alpha = BigInteger

fun main() {
  val obj = Scanner(System.`in`)
  val kVal = obj.nextInt()
  val nVal = obj.nextInt()

  val radio = BigInteger.TEN.pow(kVal)
  val index = 1

  /** Space to call the recursive method **/
  print(pi(kVal, nVal, radio, radio, index))
}

fun pi(k: Int, n: Int, rd: BigInteger, dm: BigInteger, i: Int): alpha {
  /** Prepare to BigInteger to calculate **/
  val middle = dm.divide(BigInteger.valueOf(2))
  val newIssue = rd.pow(2).subtract(middle.pow(2))

  val root = BigDecimal(sqrt(newIssue.toDouble()))
  val powMiddle = BigDecimal(middle.toDouble().pow(2.0))

  /** Convert the BigDecimal's to BigInteger **/
  val newRoot = root.toBigInteger()
  val newPowMid = powMiddle.toBigInteger()
  val newDiameter = newPowMid.add(rd.subtract(newRoot).pow(2)).sqrt()

  val sixVal = BigInteger.valueOf(6)
  val divideByTwo = BigInteger.TWO
  val productPi = BigInteger.valueOf(2).pow(n)
  val pi = newDiameter.multiply(sixVal).multiply(productPi).divide(divideByTwo)

  if (i == n) {
    return pi
  } else {
    return pi(k, n, rd, newDm, i + 1)
  }
}

/* CAT DATA.lst | java -jar imengineerdew.jar
314159265359872475220580630756610735615825944194532245504
*/
