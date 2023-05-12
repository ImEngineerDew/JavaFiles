import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rubikRecursive {
  public static HashMap<String, List<Integer>> rotateFace(String face, HashMap<String, List<Integer>> rubikCube) {
    List<Integer> newFace = Arrays.asList(
            rubikCube.get(face).get(2),
            rubikCube.get(face).get(5),
            rubikCube.get(face).get(8),
            rubikCube.get(face).get(1),
            rubikCube.get(face).get(4),
            rubikCube.get(face).get(7),
            rubikCube.get(face).get(0),
            rubikCube.get(face).get(3),
            rubikCube.get(face).get(6)
    );
    rubikCube.put(face, newFace);
    return rubikCube;
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
      sides = Arrays.asList("B", "D", "F", "U");
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
    HashMap<String, List<Integer>> newRubikCube = new HashMap<>();
    newRubikCube.put("F", new ArrayList<>(rubikCube.get("F")));
    newRubikCube.put("R", new ArrayList<>(rubikCube.get("R")));
    newRubikCube.put("D", new ArrayList<>(rubikCube.get("D")));
    newRubikCube.put("L", new ArrayList<>(rubikCube.get("L")));
    newRubikCube.put("U", new ArrayList<>(rubikCube.get("U")));
    newRubikCube.put("B", new ArrayList<>(rubikCube.get("B")));

    newRubikCube.get(sides.get(0)).set(newPosition.get(0).get(0), rubikCube.get(sides.get(3)).get(newPosition.get(3).get(0)));
    newRubikCube.get(sides.get(0)).set(newPosition.get(0).get(1), rubikCube.get(sides.get(3)).get(newPosition.get(3).get(1)));
    newRubikCube.get(sides.get(0)).set(newPosition.get(0).get(2), rubikCube.get(sides.get(3)).get(newPosition.get(3).get(2)));

    newRubikCube.get(sides.get(1)).set(newPosition.get(1).get(0), rubikCube.get(sides.get(0)).get(newPosition.get(0).get(0)));
    newRubikCube.get(sides.get(1)).set(newPosition.get(1).get(1), rubikCube.get(sides.get(0)).get(newPosition.get(0).get(1)));
    newRubikCube.get(sides.get(1)).set(newPosition.get(1).get(2), rubikCube.get(sides.get(0)).get(newPosition.get(0).get(2)));

    newRubikCube.get(sides.get(2)).set(newPosition.get(2).get(0), rubikCube.get(sides.get(1)).get(newPosition.get(1).get(0)));
    newRubikCube.get(sides.get(2)).set(newPosition.get(2).get(1), rubikCube.get(sides.get(1)).get(newPosition.get(1).get(1)));
    newRubikCube.get(sides.get(2)).set(newPosition.get(2).get(2), rubikCube.get(sides.get(1)).get(newPosition.get(1).get(2)));

    newRubikCube.get(sides.get(3)).set(newPosition.get(3).get(0), rubikCube.get(sides.get(2)).get(newPosition.get(2).get(0)));
    newRubikCube.get(sides.get(3)).set(newPosition.get(3).get(1), rubikCube.get(sides.get(2)).get(newPosition.get(2).get(1)));
    newRubikCube.get(sides.get(3)).set(newPosition.get(3).get(2), rubikCube.get(sides.get(2)).get(newPosition.get(2).get(2)));
    return newRubikCube;
  }
  /**
   * Check the number of rotations
   **/
  public static HashMap<String, List<Integer>> rotateMany(List<String> moves, int size, int index, HashMap<String, List<Integer>> rubikCube) {
    if (index == size) {
      return rubikCube;
    } else {
      HashMap<String, List<Integer>> newRubikCube = rotates(moves.get(index), rubikCube);
      Integer newIndex = index + 1;
      return rotateMany(moves, size, newIndex , newRubikCube);
    }
  }

  /**
   * This method can rotate the sides
   **/
  public static HashMap<String, List<Integer>> rotates(String faces, HashMap<String, List<Integer>> rubikCube) {
    return rotateFace(faces, rotateSides(faces, rubikCube));
  }

  /**
   * Find the stickers of Rubik's cube
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
  public static void main(String[] args) {
    HashMap<String, List<Integer>> rubikCube = new HashMap<>();
    rubikCube.put("F", Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18));
    rubikCube.put("R", Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28));
    rubikCube.put("D", Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38));
    rubikCube.put("L", Arrays.asList(40, 41, 42, 43, 44, 45, 46, 47, 48));
    rubikCube.put("U", Arrays.asList(50, 51, 52, 53, 54, 55, 56, 57, 58));
    rubikCube.put("B", Arrays.asList(60, 61, 62, 63, 64, 65, 66, 67, 68));

    Scanner object = new Scanner(System.in);
    int size = Integer.parseInt(object.nextLine());
    String moveSides = object.nextLine();

    List<String> movingList = Arrays.asList(moveSides.split(" "));
    HashMap<String, List<Integer>> cubeResult = rotateMany(movingList, size, 0, rubikCube);
    System.out.println(String.join(" ", findStickers(cubeResult)));
  }
}