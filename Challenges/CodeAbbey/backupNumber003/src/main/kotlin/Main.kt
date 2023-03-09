import java.util.Arrays
import java.util.Scanner


fun readVectors(vector: IntArray, index: Int, value: Scanner) {
    if (index == vector.size) {
        return
    }
    print("Write the values of {$index} ")
    vector[index] = value.nextInt()
    readVectors(vector, index + 1, value)
}

fun sumOfVector(vectorA: IntArray, vectorB: IntArray, index: Int): IntArray {
    if(index == vectorA.size || index == vectorB.size) {
        return intArrayOf()
    }
    val subResult = sumOfVector(vectorA,vectorB,index+1)
    val result = IntArray(subResult.size+1)

    result[0] = vectorA[index]+vectorB[index]
    subResult.copyInto(result,1)

    return result
}

fun main(Arrays<String>) {

    val obj = Scanner(System.`in`)

    print("Write the size of array: ")
    val sizeArray = obj.nextInt()

    /** Reading the first vector **/
    val vectorOne = IntArray(sizeArray)
    readVectors(vectorOne,0,obj)

    /** Reading the second vector **/
    val vectorTwo = IntArray(sizeArray)
    readVectors(vectorTwo,0,obj)

    /** Implements recursion by sum operation **/
    val result = sumOfVector(vectorOne,vectorTwo,0)

    print("${Arrays.toString(result)}")
}