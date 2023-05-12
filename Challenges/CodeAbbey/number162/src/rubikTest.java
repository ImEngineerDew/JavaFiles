import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rubikTest {
  public static Map<String, List<Integer>> rotateFace(String face, Map<String, List<Integer>> cube) {
    List<Integer> newFace = Arrays.asList(
            cube.get(face).get(2),
            cube.get(face).get(5),
            cube.get(face).get(8),
            cube.get(face).get(1),
            cube.get(face).get(4),
            cube.get(face).get(7),
            cube.get(face).get(0),
            cube.get(face).get(3),
            cube.get(face).get(6)
    );
    cube.put(face, newFace);

    return cube;
  }

  public static Map<String, List<Integer>> rotateSides(String face, Map<String, List<Integer>> cube) {
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

    Map<String, List<Integer>> newCube = new HashMap<>();
    newCube.put("F", new ArrayList<>(cube.get("F")));
    newCube.put("R", new ArrayList<>(cube.get("R")));
    newCube.put("D", new ArrayList<>(cube.get("D")));
    newCube.put("L", new ArrayList<>(cube.get("L")));
    newCube.put("U", new ArrayList<>(cube.get("U")));
    newCube.put("B", new ArrayList<>(cube.get("B")));

    newCube.get(sides.get(0)).set(newPosition.get(0).get(0), cube.get(sides.get(3)).get(newPosition.get(3).get(0)));
    newCube.get(sides.get(0)).set(newPosition.get(0).get(1), cube.get(sides.get(3)).get(newPosition.get(3).get(1)));
    newCube.get(sides.get(0)).set(newPosition.get(0).get(2), cube.get(sides.get(3)).get(newPosition.get(3).get(2)));

    newCube.get(sides.get(1)).set(newPosition.get(1).get(0), cube.get(sides.get(0)).get(newPosition.get(0).get(0)));
    newCube.get(sides.get(1)).set(newPosition.get(1).get(1), cube.get(sides.get(0)).get(newPosition.get(0).get(1)));
    newCube.get(sides.get(1)).set(newPosition.get(1).get(2), cube.get(sides.get(0)).get(newPosition.get(0).get(2)));

    newCube.get(sides.get(2)).set(newPosition.get(2).get(0), cube.get(sides.get(1)).get(newPosition.get(1).get(0)));
    newCube.get(sides.get(2)).set(newPosition.get(2).get(1), cube.get(sides.get(1)).get(newPosition.get(1).get(1)));
    newCube.get(sides.get(2)).set(newPosition.get(2).get(2), cube.get(sides.get(1)).get(newPosition.get(1).get(2)));

    newCube.get(sides.get(3)).set(newPosition.get(3).get(0), cube.get(sides.get(2)).get(newPosition.get(2).get(0)));
    newCube.get(sides.get(3)).set(newPosition.get(3).get(1), cube.get(sides.get(2)).get(newPosition.get(2).get(1)));
    newCube.get(sides.get(3)).set(newPosition.get(3).get(2), cube.get(sides.get(2)).get(newPosition.get(2).get(2)));

    return newCube;
  }

  public static Map<String, List<Integer>> rotate(String face, Map<String, List<Integer>> cube) {
    return rotateFace(face, rotateSides(face, cube));
  }

  public static Map<String, List<Integer>> rotateNTimes(List<String> movesList, int length, int index, Map<String, List<Integer>> cube) {
    if (index == length) {
      return cube;
    } else {
      Map<String, List<Integer>> newCube = rotate(movesList.get(index), cube);
      int newIndex = index + 1;
      return rotateNTimes(movesList, length, newIndex, newCube);
    }
  }

  public static String findSticker(Map<String, List<Integer>> cube, int sticker, int index) {
    List<String> faces = Arrays.asList("F", "R", "D", "L", "U", "B");

    if (cube.get(faces.get(index)).contains(sticker) || index == faces.size() - 1) {
      return faces.get(index);
    } else {
      return findSticker(cube, sticker, index + 1);
    }
  }

  public static List<String> findStickers(Map<String, List<Integer>> rubikCube) {
    List<String> res = IntStream.range(0, 9)
            .mapToObj(index -> findSticker(rubikCube, index + 10, 0))
            .collect(Collectors.toList());
    return res;
  }

  public static void main(String[] args) {
    Map<String, List<Integer>> cube = new HashMap<>();
    cube.put("F", Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18));
    cube.put("R", Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28));
    cube.put("D", Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38));
    cube.put("L", Arrays.asList(40, 41, 42, 43, 44, 45, 46, 47, 48));
    cube.put("U", Arrays.asList(50, 51, 52, 53, 54, 55, 56, 57, 58));
    cube.put("B", Arrays.asList(60, 61, 62, 63, 64, 65, 66, 67, 68));

    Scanner scanner = new Scanner(System.in);
    int length = Integer.parseInt(scanner.nextLine());
    String movesGuide = scanner.nextLine();
    List<String> movesList = Arrays.asList(movesGuide.split(" "));
    Map<String, List<Integer>> finalCube = rotateNTimes(movesList, length, 0, cube);

    System.out.println(String.join(" ", findStickers(finalCube)));
  }
}




