import java.util.Scanner

fun main() {
  val obj = Scanner(System.`in`)
  val size = obj.nextInt()
  val vectorList = arrayOfNulls<Int>(size)
  val swapsAndPasses = arrayOf(0, 0)

  readArray(vectorList, obj, 0)
  bubbleSortRecursive(vectorList, size - 1, swapsAndPasses)

  showBubble(vectorList, 0)
  println()
  println(swapsAndPasses[1])
  println(swapsAndPasses[0])
}
/** This recursive method can show the array  */
fun showBubble(vecRnd: Array<Int?>, index: Int) {
  if (index == vecRnd.size) {
    return
  }
  print(vecRnd[index].toString() + " ")
  showBubble(vecRnd, index + 1)
}
/** This recursive method read by keyboard the numbers on Scanner class **/
fun readArray(vecRnd: Array<Int?>, sc: Scanner, index: Int) {
  if (index == vecRnd.size) {
    return
  }
  //System.out.print("Write the numbers: ");
  vecRnd[index] = sc.nextInt()
  readArray(vecRnd, sc, index + 1)
}
/** This recursive method executes the bubblesort  */
fun bubbleSortRecursive(vecRnd: Array<Int?>, k: Int, swapsPasses: Array<Int>) {
  if (k.equals(vecRnd.size)) {
    return
  }
  var isSwapped = false
  for (l in 0 until k) {
    if (vecRnd[l]!! > vecRnd[l + 1]!!) {
      val flagHelper = vecRnd[l]
      vecRnd[l] = vecRnd[l + 1]
      vecRnd[l + 1] = flagHelper
      isSwapped = true
      /** Increase swaps  */
      swapsPasses[0]++
    }
  }
  /** Increase passes  */
  swapsPasses[1]++
  if (isSwapped) {
    bubbleSortRecursive(vecRnd, k - 1, swapsPasses)
  }
}