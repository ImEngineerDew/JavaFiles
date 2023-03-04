import java.util.Scanner;

public class recursiveCountCharacters {
  public static void main(String[] args) {


  }

  public static void showVector(Integer vector[], Integer index) {
    if (index.equals(vector.length)) {
      System.out.println(vector[index]);
    } else {
      showVector(vector, index + 1);
    }
  }

  public static void readVectorString(String vector[], Scanner object, Integer index)
  {
      if(index.equals(vector.length))
      {
        return;
      }
      vector[index] = object.nextLine();
      readVectorString(vector,object,index+1);
  }
}
