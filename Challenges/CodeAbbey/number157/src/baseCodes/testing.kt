package baseCodes

import kotlin.math.roundToLong
import kotlin.text.StringBuilder

fun main() {
  val binary = readLine()!!
  val parent = parents(0, 0, binary)
  val steps = step(0, 0, binary, StringBuilder(), 0)
  print("$steps ${Math.pow(2.0, parent - 1.0).roundToLong()}")
}

fun step(lp: Int, cou: Int, bin: String, inp: StringBuilder, tCo: Int): Int {
  if (bin != "10") {
    if (!bin.contains("2")) {
      var x = bin
      x += "2"
      return step(lp, cou, x, inp, tCo)
    } else {
      if (lp < bin.length - 1) {
        if (bin[lp] == bin[lp + 1]) {
          return step(lp + 1, cou + 1, bin, inp, tCo)
        } else {
          var counter = cou
          counter += 1
          inp.append(Integer.parseInt(counter.toString()).toString(2))
          return step(lp + 1, cou = 0, bin = bin, inp = inp, tCo = tCo)
        }
      } else {
        val repNum = inp.toString().replace("2", "")
        val string = StringBuilder("")
        return step(lp = 0, cou = 0, bin = repNum, inp = string, tCo = tCo + 1)
      }
    }
  }
  return tCo
}

fun parents(lp: Int, parent: Int, binary: String): Int {
  if (lp < binary.length) {
    if (binary[lp] == '1') {
      return parents(lp + 1, parent + 1, binary)
    }
    return parents(lp + 1, parent, binary)
  }
  return parent
}