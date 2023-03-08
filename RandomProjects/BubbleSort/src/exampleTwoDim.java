import java.util.Scanner;
public class exampleTwoDim
{
    public static void main(String args[])
    {
      int i= 0, j=0;
      Scanner ob = new Scanner(System.in);
      int size = ob.nextInt();

      Integer matrix[][] = new Integer[size][size];
      twoArray(matrix,i,j,ob);

    }

    public static void twoArray(Integer mat[][],int i, int j, Scanner sc)
    {
      if(i == mat.length || j == mat.length)
      {
        return;
      }
      System.out.println(mat[i][j]);
      if(j<mat[i].length-1)
      {
        System.out.println("Write the numbers: ");
        mat[i][j] = sc.nextInt();
        twoArray(mat,i,j+1,sc);
      }
      else
      {
        twoArray(mat,i+1,0,sc);
      }
    }

}
