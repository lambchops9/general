public class recs {
    public static void main(String[]args) {
        int res = factorial(30);
        System.out.println(res);
    }

    // recursive statement including base case
    private static int factorial(int n) {
        if (n == 0) {                    // base case
            return 1;
        } else {
            return n * factorial(n-1);      // continues/recursive case until the base case is met
        }
    }
}
