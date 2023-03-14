import java.util.Scanner;

public class triangleArea
{
  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    int sizeArr = obj.nextInt();

    Integer index = 0;

    Double result[] = new Double[sizeArr];
    Double vector[] = new Double[6];
    /** This line code must print the result **/
    result(result,vector,obj,index);
  }
  public static void result(Double res[],Double vec[],Scanner sc,Integer index)
  {
    /** Check if the index is equals to length of our vector [] and result[] **/
    if(!index.equals(res.length) && !index.equals(vec.length))
    {
      readVector(vec,sc,0);
      res[index] = calculateArea(vec);
      System.out.printf("%.1f",res[index].doubleValue());
      System.out.println(" ");
      result(res,vec,sc,index+1);
    }
  }
  public static void readVector(Double vector[],Scanner sc ,Integer index)
  {
    /** Check if the index is equals to length of our array vector[] **/
    if(!index.equals(vector.length))
    {
      vector[index] = sc.nextDouble();
      readVector(vector,sc,index+1);
    }
  }
  /** This method must return an object of type Double that indicates to calculate the triangle area **/
  public static Double calculateArea(Double vector[])
  {
    Double result = 0.5*Math.abs(((vector[0]*vector[3])+(vector[2]*vector[5])
            +(vector[4]*vector[1])-(vector[2]*vector[1])
            -(vector[4]*vector[3])-(vector[0]*vector[5])));
    return result;
  }
}