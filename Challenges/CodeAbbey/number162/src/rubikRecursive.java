import java.util.*;

public class rubikRecursive {
  private static HashMap<String, List<Integer>>  rubikCube = new HashMap<>();
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);
    System.out.println("Write the size of your array: ");
    int size = object.nextInt();

    rubikCube.put("F", Arrays.asList(10,11,12,13,14,15,16,17,18));
    rubikCube.put("B", new Integer[] {0,0,0,0,0,0,0,0});
    rubikCube.put("L", new Integer[] {0,0,0,0,0,0,0,0});
    rubikCube.put("R", new Integer[] {0,0,0,0,0,0,0,0});
    rubikCube.put("U", new Integer[] {0,0,0,0,0,0,0,0});
    rubikCube.put("D", new Integer[] {0,0,0,0,0,0,0,0});

    Integer [] vec = new Integer[size];
    readVector (vec, object, 0);
    showVector (vec, 0);
  }

  public static void readVector(Integer vector[], Scanner sc, int index) {
    if (index < vector.length) {
      vector[index] = sc.nextInt();
      readVector(vector, sc, index + 1);
    }
  }

  public static void showVector(Integer vector[], int index) {
    if (index < vector.length) {
      System.out.print(vector[index]+" ");
      showVector(vector, index + 1);
    }
  }
}
