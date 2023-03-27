/*
$ kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar
*/

import java.util.Scanner

fun main() {
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
    val coe = bezout(vA[i]!!, vB[i]!!, vA[i]!!, 1, 0, vB[i]!!, 0, 1)
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
  val coefficients = bezout(a, b, a, 1, 0, b, 0, 1)
  return coefficients[0]
}

fun bezout(
  a: Int, b: Int, r: Int, s: Int, t: Int, x: Int, y: Int, z: Int
): IntArray {
  var r = r
  var s = s
  var t = t
  var x = x
  var y = y
  var z = z
  return if (r == 0) {
    intArrayOf(x, y, z)
  } else {
    val quotient = x / r
    var temp = x % r
    x = r
    r = temp
    temp = y - quotient * s
    y = s
    s = temp
    temp = z - quotient * t
    z = t
    t = temp
    bezout(a, b, r, s, t, x, y, z)
  }
}

/*
$ cat DATA.lst | java -jar imengineerdew.jar
1 17872 -5789
1 -3399 24238
2 -18088 4353
9 556 -1795
1 -2922 2887
1 21835 -10679
1 -24482 26609
1 -6184 7755
33 608 -993
3 584 -429
7 3727 -2091
1 25249 -18762
1 -5783 6004
2 1069 -1693
1 120 -169
1 25008 -7331
29 769 -1493
1 -1240 4393
4 8697 -3854
2 -4180 4813
1 -23433 4540
3 255 -107
1 -6531 1985
2 6046 -6693
18 1222 -381
 */