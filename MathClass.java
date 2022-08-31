package JavaSE;
import java.util.function.Function;

public class MathClass
{
    public static void main(String[] args) {
        Function<Integer,Integer> squareFunction = new Function <Integer,Integer>(){
            @Override   
            public Integer apply(Integer X)
            {
                return X*X;
            }
        };
        System.out.println(squareFunction.apply(125));

    }
}