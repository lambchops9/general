public class occurrences {
    public static void main(String[]args) {

    }
    private static int countChar(String str, char targ) {
        if (str.length() == 0) {
            return 0;
        }
        int count = (str.charAt(0) == targ) ? 1 : 0;

        return count + countChar(str.substring(1), targ);
    }
}
