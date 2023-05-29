public class Main {
    public static boolean isPalindrome(Integer nValue) {
        String numberStr = String.valueOf(nValue);
        String isPal = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(isPal);
    }
    public static int nextPalindrome(int number, int nextPal) {
        if (isPalindrome(nextPal)) {
            return nextPal - number;
        } else {
            nextPalindrome(number, nextPal + 1);
        }
    }
}