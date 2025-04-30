public class substring {
    public static void main(String[] args){
        String str = "Hello world!";
        System.out.println(str.substring(0, 5)); // substring() method to get the substring from index 0 to 5
        System.out.println(str.substring(6)); // substring() method to get the substring from index 6 to end of string
        System.out.println(str.substring(6, str.length())); // substring() method to get the substring from index 6 to end of string using length() method
        System.out.println(str.substring(0, str.length())); // substring() method to get the whole string using length() method
    }
}
