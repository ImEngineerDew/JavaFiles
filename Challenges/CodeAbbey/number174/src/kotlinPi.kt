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

    /** Convert the BigDecimal's to BigInteger **/
    val newRoot = root.toBigInteger()
    val newPowMid = powMid.toBigInteger()
    val diameter = newPowMid.add(radio.subtract(newRoot).pow(2)).sqrt()

    val sixValue = BigInteger.valueOf(6)
    val divideByTwo = BigInteger.TWO
    val productPi = BigInteger.valueOf(2).pow(n)
    val pi = diameter.multiply(sixValue).multiply(productPi).divide(divideByTwo)

    if(index==n)
    {
        return pi
    }
    else
    {
        return pi(k,n,radio,diameter,index+1)
    }
}
