public class UpdatedReverseString {

    public static void main(String[] args) {
        String name = "Hello World !!!";
        String reverseStr="";

        for (int i = name.length()-1;i>=0;i--){
            reverseStr+=name.charAt(i);
        }

        System.out.println("reverseStr:: "+reverseStr);

    }
}
