public class ReverseString {


    public static String reverserString(String input) {

        StringBuffer reverseString = new StringBuffer();
        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            // will append character which array index of i
            reverseString.append(chars[i]);
        }
        return reverseString.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverserString("nikkhat"));
    }

}