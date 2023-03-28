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
  readVector(valA, valB, `object`, index)
  val gcdVal = calculateGCD(valA, valB, index)
  showVector(valA, valB, gcdVal, index)
}

fun readVector(vA: Array<Int?>, vB: Array<Int?>, sc: Scanner, index: Int) {
  if (index != vA.size) {
    vA[index] = sc.nextInt()
    vB[index] = sc.nextInt()
    readVector(vA, vB, sc, index + 1)
  }
}

fun calculateGCD(vA: Array<Int?>, vB: Array<Int?>, index: Int): Array<Int?> {
  if (index == vA.size) {
    return arrayOfNulls(vA.size)
  }
  val gcdValue = calculateGCD(vA, vB, index + 1)
  gcdValue[index] = commonGreaterDivisor(vA[index]!!, vB[index]!!)
  return gcdValue
}

fun showVector(vA: Array<Int?>, vB: Array<Int?>, rs: Array<Int?>, i: Int) {
  if (i != vA.size) {
<<<<<<< HEAD
    val coe = b(vA[i]!!, vB[i]!!, vA[i]!!, 1, 0, vB[i]!!, 0, 1)
=======
    val coe = bezout(vA[i]!!, vB[i]!!)
>>>>>>> a96221795418de9cb887284a130ed38d19d79bc5
    println(rs[i].toString() + " " + coe[1] + " " + coe[2])
    showVector(vA, vB, rs, i + 1)
  }
}

fun commonGreaterDivisor(a: Int, b: Int): Int {
  if (a < b) {
    return commonGreaterDivisor(b, a)
  } else if (b == 0) {
    return a
  }
<<<<<<< HEAD
  val coefficients = b(a, b, a, 1, 0, b, 0, 1)
  return coefficients[0]
}

fun b(a: Int, b: Int, r: Int, s: Int, t: Int, x: Int, y: Int, z: Int): IntArray {
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
    b(a, b, r, s, t, x, y, z)
=======
  val coefficients = bezout(a, b)
  return coefficients[0]
}

fun bezout(a: Int, b: Int): IntArray {
  var r = a
  var s = 1
  var t = 0
  var x = b
  var y = 0
  var z = 1
  while (x != 0) {
    val quotient = r / x
    var temp = r % x
    r = x
    x = temp
    temp = s - quotient * y
    s = y
    y = temp
    temp = t - quotient * z
    t = z
    z = temp
>>>>>>> a96221795418de9cb887284a130ed38d19d79bc5
  }
  return intArrayOf(r, s, t)
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