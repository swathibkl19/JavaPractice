public class RevString {

    public static String revString(String givenString) {
        String str = "";

        for (int i = givenString.length() - 1; i >= 0; i--) {

            str += givenString.charAt(i);
        }

        return str;
    }

    public static void main(String[] args) {

        String givenString = "Bank Of America";

        System.out.println(revString(givenString));
    }
}
