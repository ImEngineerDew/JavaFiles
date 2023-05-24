/*
$ kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar
*/

import java.util.Scanner;

fun main() {
  val obj = Scanner(System.`in`)
  val sizeArr = obj.nextInt()
  val index = 0
  val result = arrayOfNulls<Double>(sizeArr)
  val vector = arrayOfNulls<Double>(6)
  /** This line code call the method readVector and invokes calculateArea to reading this vector  */
  cal(result, vector, obj)
  /** This line code must print the result  */
  resultTriangle(result, index)
}

fun cal(res: Array<Double?>, vec: Array<Double?>, sc: Scanner, i: Int = 0) {
  if (i == res.size) {
    return
  }
  readVector(vec, sc, 0)
  res[i] = calculateArea(vec)
  cal(res, vec, sc, i + 1)
}


fun resultTriangle(result: Array<Double?>, index: Int) {
  /** Check if the index is equals to length of our array result[]  */
  if (index != result.size) {
    println("%.1f".format(result[index]!!))
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
/** This method must return the value of triangle area **/
fun calculateArea(vector: Array<Double?>): Double {
  return 0.5*Math.abs(((vector[0]!!*vector[3]!!)+(vector[2]!!*vector[5]!!)
          +(vector[4]!!*vector[1]!!)-(vector[2]!!*vector[1]!!)
          -(vector[4]!!*vector[3]!!)-(vector[0]!!*vector[5]!!)));
}

/*
$ cat DATA.lst | java -jar imengineerdew.jar
2144740,5 25372731,0 12311521,5 14001892,0
19618994,0 13864169,0 11367147,0 5677778,0
16303398,5 10550523,0 7370229,0 11961245,5
3812345,0 3024252,0 11388230,0 16298337,0
*/