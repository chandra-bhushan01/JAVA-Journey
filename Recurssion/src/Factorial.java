public class Factorial {
    public static int factorial(int i) {
        if (i <= 1) {
            return 1;

        }
        return i * factorial(i-1);
    }

    public static void main(String[] args) {
        int ans = factorial(3);
        System.out.println(ans);
    }

}
