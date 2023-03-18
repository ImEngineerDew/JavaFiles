import java.util.Scanner

fun main() {
  val `object` = Scanner(System.`in`)
  val size = `object`.nextInt()
  val pythagoras = arrayOfNulls<Double>(size)

  readVector(pythagoras, `object`, 0)
  showResult(pythagoras, 0)
}

fun readVector(vec: Array<Double?>, sc: Scanner, index: Int) {
  if (index != vec.size) {
    val s = sc.nextLong()
    vec[index] = calculateSquaresAux(s, 1, 2)
    readVector(vec, sc, index + 1)
  }
}

fun showResult(vec: Array<Double?>, index: Int) {
  if (index != vec.size) {
    System.out.printf("%.0f", vec[index])
    println(" ")
    showResult(vec, index + 1)
  }
}

fun calculateSquaresAux(s: Long, m: Long, n: Long): Double {
  var m = m
  var n = n
  m = 2
  while (m <= Math.sqrt(s.toDouble())) {
    n = 1
    while (n < m) {
      val a = Math.pow(m.toDouble(), 2.0) - n * n
      val b = 2.0 * m * n
      val c = Math.pow(m.toDouble(), 2.0) + Math.pow(n.toDouble(), 2.0)
      if (a + b + c == s.toDouble()) {
        return Math.pow(c, 2.0)
      }
      n++
    }
    m++
  }
  return 0.0
}