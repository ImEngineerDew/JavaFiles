import java.util.Scanner

fun main() {
  val element = Scanner(System.`in`)

  println("Write the size of your array: ")
  val size = element.nextInt()

  val i = 0

  val sideA = arrayOfNulls<Long>(size)
  val sideB = arrayOfNulls<Long>(sideA.size)
  val sideC = arrayOfNulls<Long>(sideA.size)

  readSideA(sideA, element, i)
  readSideB(sideB, element, i)
  readSideC(sideC, element, i)
  checkS(sideA, sideB, sideC, i)
}


fun readSideA(sideA: Array<Long?>, `object`: Scanner, index: Int) {
  if (index == sideA.size) {
    return
  }
  print("Write the length of side A: ")
  sideA[index] = `object`.nextLong()
  readSideA(sideA, `object`, index + 1)
}

fun readSideB(sideB: Array<Long?>, `object`: Scanner, index: Int) {
  if (index == sideB.size) {
    return
  }
  print("Write the length of side B: ")
  sideB[index] = `object`.nextLong()
  readSideB(sideB, `object`, index + 1)
}

fun readSideC(sideC: Array<Long?>, `object`: Scanner, index: Int) {
  if (index == sideC.size) {
    return
  }
  print("Write the length of side C: ")
  sideC[index] = `object`.nextLong()
  readSideC(sideC, `object`, index + 1)
}

fun checkS(sdA: Array<Long?>, sdB: Array<Long?>, sdC: Array<Long?>, i: Int) {
  if (i == sdA.size || i == sdB.size || i == sdC.size) {
    return
  }
  if (sdA[i]!! + sdB[i]!! > sdC[i]!!) {
    if (sdA[i]!! + sdC[i]!! > sdB[i]!!) {
      if (sdB[i]!! + sdC[i]!! > sdA[i]!!) {
        print(1.toString() + " ")
      } else {
        print(0.toString() + " ")
      }
    } else {
      print(0.toString() + " ")
    }
  } else {
    print(0.toString() + " ")
  }
  checkS(sdA, sdB, sdC, i + 1)
}
