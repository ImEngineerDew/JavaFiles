import java.util.Scanner

fun main() {
  val `object` = Scanner(System.`in`)
  val size = `object`.nextInt()
  val base = arrayOfNulls<Long>(size)
  val exp = arrayOfNulls<Long>(base.size)
  val module = arrayOfNulls<Long>(base.size)
  rV(base, exp, module, `object`, 0)
  val calculateModule = modularCalculator(base, exp, module, 0)
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

fun showResults(result: Array<Long?>, index: Int) {
  if (index != result.size) {
    print(result[index].toString() + " ")
    showResults(result, index + 1)
  }
}

fun modularCalculator(base: Array<Long?>, exp: Array<Long?>, module: Array<Long?>, index: Int): Array<Long?> {
  if (index == base.size) {
    return arrayOfNulls(base.size)
  }
  val moduleC = modularCalculator(base, exp, module, index + 1)
  moduleC[index] = calculateModular(base[index], exp[index], module[index])
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