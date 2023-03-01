import java.util.Arrays;

public class Recorrer{

    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {10, 20, 30, 40, 50};

        int[] resultado = sumarVectores(v1, v2);

        System.out.println(Arrays.toString(resultado)); // Imprime [11, 22, 33, 44, 55]
    }

    public static int[] sumarVectores(int[] v1, int[] v2) {
        if (v1.length == 0 || v2.length == 0) {
            return new int[0];
        }

        int[] subv1 = Arrays.copyOfRange(v1, 1, v1.length);
        int[] subv2 = Arrays.copyOfRange(v2, 1, v2.length);

        int[] subresultado = sumarVectores(subv1, subv2);

        int[] resultado = new int[subresultado.length + 1];

        resultado[0] = v1[0] + v2[0];
        System.arraycopy(subresultado, 0, resultado, 1, subresultado.length);

        return resultado;
    }

}