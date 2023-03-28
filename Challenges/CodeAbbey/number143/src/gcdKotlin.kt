import java.util.*

fun main(args: Array<String>) {
  val `object` = Scanner(System.`in`)
  val size = `object`.nextInt()
  val index = 0
  val vector = arrayOfNulls<Int>(size)
  val valA = arrayOfNulls<Int>(vector.size)
  val valB = arrayOfNulls<Int>(vector.size)
  r(valA, valB, `object`, index)
  val gcdVal = calcGCD(valA, valB, index)
  shV(valA, valB, gcdVal, index)
}

fun r(vA: Array<Int?>, vB: Array<Int?>, sc: Scanner, index: Int) {
  if (index != vA.size) {
    vA[index] = sc.nextInt()
    vB[index] = sc.nextInt()
    r(vA, vB, sc, index + 1)
  }
}

fun calcGCD(vA: Array<Int?>, vB: Array<Int?>, index: Int): Array<Int?> {
  if (index == vA.size) {
    return arrayOfNulls(vA.size)
  }
  val gcdValue = calcGCD(vA, vB, index + 1)
  gcdValue[index] = commonGreaterDivisor(vA[index]!!, vB[index]!!)
  return gcdValue
}

fun shV(vA: Array<Int?>, vB: Array<Int?>, rs: Array<Int?>, i: Int) {
  if (i != vA.size) {
    val coe = b(vA[i]!!, vB[i]!!, vA[i]!!, 1, 0, vB[i]!!, 0, 1)
    println(rs[i].toString() + " " + coe[1] + " " + coe[2])
    shV(vA, vB, rs, i + 1)
  }
}

fun commonGreaterDivisor(a: Int, b: Int): Int {
  if (a < b) {
    return commonGreaterDivisor(b, a)
  } else if (b == 0) {
    return a
  }
  val coefficients = b(a, b, a, 1, 0, b, 0, 1)
  return coefficients[0]
}

fun b(a: Int, b: Int, r: Int, s: Int, t: Int, x: Int, y: Int, z: Int): IntArray {
  if (r == 0) {
    return intArrayOf(x, y, z)
  } else {
    val quotient = x / r
    var temp = x % r
    var x = r
    var r = temp

    temp = y - quotient * s
    var y = s
    var s = temp

    temp = z - quotient * t
    var z = t
    var t = temp

    return b(a, b, r, s, t, x, y, z)
  }
}