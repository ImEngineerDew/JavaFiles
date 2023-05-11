import java.util.*;

public class rubikRecursive {
  private static HashMap<String, List<Integer>> rubikCube = new HashMap<>();

  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);
    System.out.println("Write the size of your array: ");
    int size = object.nextInt();

    System.out.println("Write the quantity of movements of your cube: ");
    String moveSides = object.nextLine();

    rubikCube.put("F", Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18));
    rubikCube.put("R", Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28));
    rubikCube.put("D", Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38));
    rubikCube.put("L", Arrays.asList(40, 41, 42, 43, 44, 45, 46, 47, 48));
    rubikCube.put("U", Arrays.asList(50, 51, 52, 53, 54, 55, 56, 57, 58));
    rubikCube.put("B", Arrays.asList(60, 61, 62, 63, 64, 65, 66, 67, 68));

    List<String> movingList = Arrays.asList(moveSides.split(" "));
    Map<String, List<Integer>> cubeResult = rotateMany(movingList, size, 0, rubikCube);
    System.out.println(String.join(" "), findStickers(cubeResult));
  }

  /** Check the amount of rotations **/
  public static Map<String, List<Integer>> rotateMany(List<String> moves, int size, int index, HashMap<String, List<Integer>> rubikCube) {
    if (index == size) {
      return rubikCube;
    } else {
      HashMap<String, List<Integer>> newCube = rotates(moves.get(index), rubikCube);
      return rotateMany(moves, size, index + 1, newCube);
    }
  }


}
