import java.util.Scanner
import java.math.BigInteger
import java.math.BigDecimal

fun main()
{
    val obj = Scanner(System.`in`)
    val kVal = obj.nextInt()
    val nVal = obj.nextInt()

    val radio = BigInteger.TEN.pow(kVal)
    val diameter = radio
    val index = 1

    /** Space to call the recursive method **/
    print(pi(kVal,nVal,radio,diameter,index))
}
fun pi(k: Int,n: Int,radio: BigInteger,diameter: BigInteger,index: Int): BigInteger
{
    /** Prepare to BigInteger to calculate **/
    val middle = diameter.divide(BigInteger.valueOf(2))
    val newIssue = radio.pow(2).subtract(middle.pow(2))

    val root = BigDecimal(Math.sqrt(newIssue.toDouble()))
    val powMid = BigDecimal(Math.pow(middle.toDouble(), 2.0))
}
