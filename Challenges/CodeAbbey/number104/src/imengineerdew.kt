import java.util.Scanner;

fun main() {
  val obj = Scanner(System.`in`)
  val sizeArr = obj.nextInt()
  val index = 0
  val result = arrayOfNulls<Double>(sizeArr)
  val vector = arrayOfNulls<Double>(6)
  /** This line code call the method readVector and invokes calculateArea to reading this vector  */
  for (i in 0 until sizeArr) {
    readVector(vector, obj, 0)
    result[i] = calculateArea(vector)
  }
  /** This line code must print the result  */
  resultTriangle(result, index)
}

fun resultTriangle(result: Array<Double?>, index: Int) {
  /** Check if the index is equals to length of our array result[]  */
  if (index != result.size) {
    println(result[index].toString() + " ")
    resultTriangle(result, index + 1)
  }
}

fun readVector(vector: Array<Double?>, sc: Scanner, index: Int) {
  /** Check if the index is equals to length of our array vector[]  */
  if (index != vector.size) {
    vector[index] = sc.nextDouble()
    readVector(vector, sc, index + 1)
  }
}
/** This method must return an object of type Double that indicates to calculate the triangle area  */
fun calculateArea(vector: Array<Double?>): Double {
  return 0.5 * Math.abs(
    vector[0]!! * vector[3]!! + vector[2]!! * vector[5]!! + vector[4]!! * vector[1]!!
            - vector[2]!! * vector[1]!! - vector[4]!! * vector[3]!! - vector[0]!! * vector[5]!!
  )
}