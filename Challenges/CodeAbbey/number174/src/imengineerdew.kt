/* kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar */

import java.math.BigInteger
import java.util.Scanner

typealias alpha = BigInteger

fun main() {
  val `object` = Scanner(System.`in`)
  /** Input values of K and N  */
  val kValue = `object`.nextInt()
  val nValue = `object`.nextInt()
  val radio = BigInteger.TEN.pow(kValue)
  /** Space to call the recursive method  */
  println(pi(kValue, nValue, radio, radio, 1))
}

fun pi(k: Int, n: Int, rd: BigInteger, dm: BigInteger, i: Int): alpha {
  /** Prepare the BigInteger to calculate  */
  val middle = dm.divide(BigInteger.valueOf(2))
  val newIssue = rd.pow(2).subtract(middle.pow(2))
  val root = newIssue.sqrt()
  val powMiddle = middle.pow(2)
  val newDm = powMiddle.add(rd.subtract(root).pow(2)).sqrt()
  /** Let's calculate the pi number  */
  val sixValue = BigInteger.valueOf(6)
  val divideByTwo = BigInteger.TWO
  val productPi = BigInteger.valueOf(2).pow(n)
  val pi = newDm.multiply(sixValue).multiply(productPi).divide(divideByTwo)
  return if (i == n) {
    pi
  } else {
    pi(k, n, rd, newDm, i + 1)
  }
}

/* cat DATA.lst | java -jar imengineerdew.jar
314159265358979323846215702516987516863791293578178723840
*/
