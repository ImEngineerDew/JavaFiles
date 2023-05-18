import java.util.Arrays;
public clas{
  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    String result = main(arr);
    System.out.println(result);
  }

  public static String draw(int min, double step, int[] arr, int n, String[] data, int[] aTemp) {
    if (n < arr.length) {
      int row = (int) Math.floor((arr[n] - min) / step);
      data[row] += " ".repeat(n - aTemp[row]) + "*";
      aTemp[row] = n + 1;
      return draw(min, step, arr, n + 1, data, aTemp);
    } else {
      StringBuilder sb = new StringBuilder();
      for (int i = data.length - 1; i >= 0; i--) {
        sb.append(data[i]).append("\n");
      }
      return sb.toString();
    }
  }

  public static String main(int[] arr) {
    if (arr.length < 1) {
      return "";
    } else {
      String[] zeros = new String[10];
      for (int i = 0; i < zeros.length; i++) {
        zeros[i] = "";
      }
      int min = Arrays.stream(arr, 1, arr.length).min().getAsInt();
      double step = (Arrays.stream(arr, 1, arr.length).max().getAsInt() - min) / 10.0;
      String[] data = new String[10];
      for (int i = 0; i < data.length; i++) {
        data[i] = zeros[i];
      }
      int[] aTemp = Arrays.copyOf(zeros, zeros.length);
      return draw(min, step, Arrays.copyOfRange(arr, 1, arr.length), 0, data, aTemp);
    }
  }
}
