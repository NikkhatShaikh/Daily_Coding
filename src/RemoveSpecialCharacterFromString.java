public class RemoveSpecialCharacterFromString {
    public static void main(String[] args) {
        String str ="@#$%%Nikkhat$(**(*&^&  123";
        str =str.replaceAll("[^a-zA-Z0-9\\s]","");  //\\s for accept space also
        System.out.println(str);
    }
}
