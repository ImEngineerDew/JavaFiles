package baseCodes;
import java.lang.StringBuilder;
import java.util.Scanner;
public class testing{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String binary = scanner.nextLine();
    scanner.close();

    int parent = parents(0, 0, binary);
    int steps = step(0, 0, binary, new StringBuilder(), 0);

    System.out.println(steps + " " + (long) Math.pow(2, parent - 1));
  }

  public static int step(int lp, int cou, String bin, StringBuilder inp, int tCo) {
    if (!bin.equals("10")) {
      if (!bin.contains("2")) {
        String x = bin + "2";
        return step(lp, cou, x, inp, tCo);
      } else {
        if (lp < bin.length() - 1) {
          if (bin.charAt(lp) == bin.charAt(lp + 1)) {
            return step(lp + 1, cou + 1, bin, inp, tCo);
          } else {
            int counter = cou + 1;
            inp.append(Integer.toBinaryString(counter));
            return step(lp + 1, 0, bin, inp, tCo);
          }
        } else {
          String repNum = inp.toString().replace("2", "");
          StringBuilder string = new StringBuilder();
          return step(0, 0, repNum, string, tCo + 1);
        }
      }
    }
    return tCo;
  }

  public static int parents(int lp, int parent, String binary) {
    if (lp < binary.length()) {
      if (binary.charAt(lp) == '1') {
        return parents(lp + 1, parent + 1, binary);
      }
      return parents(lp + 1, parent, binary);
    }
    return parent;
  }
}