import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
    HashMap<String, List<Integer>> cubeResult = rotateMany(movingList, size, 0, rubikCube);
    System.out.println(String.join("", findStickers(cubeResult)));
  }

  /**
   * Check the amount of rotations
   **/
  public static HashMap<String, List<Integer>> rotateMany(List<String> moves, int size, int index, HashMap<String, List<Integer>> rubikCube) {
    if (index == size) {
      return rubikCube;
    } else {
      HashMap<String, List<Integer>> newCube = rotates(moves.get(index), rubikCube);
      return rotateMany(moves, size, index + 1, newCube);
    }
  }

  /**
   * This method can rotate the sides
   **/
  public static HashMap<String, List<Integer>> rotates(String faces, HashMap<String, List<Integer>> rubikCube) {
    return rotateFace(faces, rotateSides(faces, rubikCube));
  }

  /**
   * Find the stickers of Rubik cube's
   **/
  public static String findSticker(HashMap<String, List<Integer>> rubikCube, int sticker, int index) {
    List<String> faces = Arrays.asList("F", "R", "D", "L", "U", "B");

    if (rubikCube.get(faces.get(index)).contains(sticker) || index == faces.size() - 1) {
      return faces.get(index);
    } else {
      return findSticker(rubikCube, sticker, index + 1);
    }
  }

  public static List<String> findStickers(HashMap<String, List<Integer>> rubikCube) {
    List<String> res = IntStream.range(0, 9)
            .mapToObj(index -> findSticker(rubikCube, index + 10, 0))
            .collect(Collectors.toList());
    return res;
  }

  public static HashMap<String, List<Integer>> rotateSides(String face, HashMap<String, List<Integer>> rubikCube) {
    List<String> sides = new ArrayList<>();
    List<List<Integer>> newPosition = new ArrayList<>();
    if (face.equals("F")) {
      sides = Arrays.asList("R", "D", "L", "U");
      newPosition = Arrays.asList(
              Arrays.asList(0, 3, 6),
              Arrays.asList(6, 7, 8),
              Arrays.asList(8, 5, 2),
              Arrays.asList(2, 1, 0)
      );
    } else if (face.equals("R")) {
      sides = Arrays.asList("B", "D", "U", "F");
      newPosition = Arrays.asList(
              Arrays.asList(0, 3, 6),
              Arrays.asList(8, 5, 2),
              Arrays.asList(8, 5, 2),
              Arrays.asList(8, 5, 2)
      );
    } else if (face.equals("D")) {
      sides = Arrays.asList("R", "B", "L", "F");
      newPosition = Arrays.asList(
              Arrays.asList(0, 1, 2),
              Arrays.asList(0, 1, 2),
              Arrays.asList(0, 1, 2),
              Arrays.asList(0, 1, 2)
      );
    } else if (face.equals("L")) {
      sides = Arrays.asList("F", "D", "B", "U");
      newPosition = Arrays.asList(
              Arrays.asList(0, 3, 6),
              Arrays.asList(0, 3, 6),
              Arrays.asList(8, 5, 2),
              Arrays.asList(0, 3, 6)
      );
    } else if (face.equals("U")) {
      sides = Arrays.asList("R", "F", "L", "B");
      newPosition = Arrays.asList(
              Arrays.asList(6, 7, 8),
              Arrays.asList(6, 7, 8),
              Arrays.asList(6, 7, 8),
              Arrays.asList(6, 7, 8)
      );
    } else {
      sides = Arrays.asList("L", "D", "R", "U");
      newPosition = Arrays.asList(
              Arrays.asList(0, 3, 6),
              Arrays.asList(2, 1, 0),
              Arrays.asList(8, 5, 2),
              Arrays.asList(6, 7, 8)
      );
    }
    HashMap <String, List<Integer>> newRubikCube = new HashMap<>();
    newRubikCube.put("F", new ArrayList<>(rubikCube.get("F")));
    newRubikCube.put("R", new ArrayList<>(rubikCube.get("R")));
    newRubikCube.put("D", new ArrayList<>(rubikCube.get("D")));
    newRubikCube.put("L", new ArrayList<>(rubikCube.get("L")));
    newRubikCube.put("U", new ArrayList<>(rubikCube.get("U")));
    newRubikCube.put("B", new ArrayList<>(rubikCube.get("B")));

    /** Space to put the distribution codes **/
    return newRubikCube;
  }
}
