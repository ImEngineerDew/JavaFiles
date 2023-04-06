/* kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar */

import java.math.BigInteger
import java.util.*

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
  /** Using the BigInteger to calculate **/
  val middle = dm.divide(BigInteger.valueOf(2))
  val newIssue = rd.pow(2).subtract(middle.pow(2))

  val root = newIssue.sqrt()
  val powMiddle = middle.pow(2)
  var newDiameter = powMiddle.add(rd.subtract(root).pow(2)).sqrt()

  /** Let's calculate the pi number **/
  val sixValue = BigInteger.valueOf(6)
  val divideByTwo = BigInteger.TWO
  val productPi = BigInteger.valueOf(2).pow(n)
  val pi = dm.multiply(sixValue).multiply(productPi).divide(divideByTwo)
  if (i == n) {
    return pi
  } else {
    return pi(k, n, rd, newDiameter, i + 1)
  }
}

/* CAT DATA.lst | java -jar imengineerdew.jar
314159265359872475220580630756610735615825944194532245504
*/
