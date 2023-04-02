public class Main {
  public static void main(String args[]) {
    int kValue = 63;
    int nValue = 33;

    double radio = (long) Math.pow(10, kValue);
    double diameter = radio;

    for (int i = 0; i < nValue; i++) {
      double middlePoint = diameter / 2L;
      long newIssue = (long) (Math.pow(radio, 2) - Math.pow(middlePoint, 2));

      double root = Math.sqrt(newIssue);
      double powMiddle = Math.pow(middlePoint, 2);
      diameter = Math.sqrt(radio + Math.pow((radio - root), 2));


      System.out.println("Iteration: " + (i + 1) + " Value of pi: " +);
    }
  }
}
