public class StringReverser {

    public static String reverse(String str) {

        // instance is must create either here or at testing code to perform tests on class.java

        StringBuilder reversed = new StringBuilder(); // local instance creation syntax

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}