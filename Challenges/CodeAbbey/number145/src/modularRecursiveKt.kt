/*
$ kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar
*/

import java.util.Scanner

fun main() {
  val `object` = Scanner(System.`in`)
  val size = `object`.nextInt()
  val base = arrayOfNulls<Long>(size)
  val exp = arrayOfNulls<Long>(base.size)
  val module = arrayOfNulls<Long>(base.size)
  rV(base, exp, module, `object`, 0)
  val calculateModule = mC(base, exp, module, 0)
  showResults(calculateModule, 0)
}

fun rV(A: Array<Long?>, B: Array<Long?>, C: Array<Long?>, s: Scanner, i: Int) {
  if (i != A.size) {
    A[i] = s.nextLong()
    B[i] = s.nextLong()
    C[i] = s.nextLong()
    rV(A, B, C, s, i + 1)
  }
}

fun showResults(result: Array<Any>, index: Int) {
  if (index != result.size) {
    print(result[index].toString() + " ")
    showResults(result, index + 1)
  }
}

fun mC(b: Array<Long?>, e: Array<Long?>, m: Array<Long?>, i: Int): Array<Any> {
  if (i == b.size) {
    return arrayOf(b.size)
  }
  val moduleC = mC(b, e, m, i + 1)
  moduleC[i] = calculateModular(b[i], e[i], m[i])
  return moduleC
}

fun calculateModular(base: Long?, exp: Long?, module: Long?): Long {
  if (module == 1L) {
    return 0L
  }
  if (exp == 0L) {
    return 1L
  }
  val temporal = calculateModular(base, exp!! / 2, module)
  var result = temporal * temporal % module!!
  if (exp % 2 == 1L) {
    result = result * base!! % module
  }
  return result
}

/*
$ cat DATA.lst | java -jar imengineerdew.jar
136367979 103171039 211726231 144849531 238404643
67726704 108081372 118415791 9886996 142331618
121855120 36435859 52644667 68896566 66501369
139239273 162763634 87936671 122631119 2811626 52976820
*/