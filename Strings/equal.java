public class equal {

    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "Hello world!";
        String str3 = new String("Hello world!");
        String str4 = new String("Hello world!");
        System.out.println(str1.equals(str2)); // equals() method to check if two strings are equal
        System.out.println(str1.equals(str3)); // equals() method to check if two strings are equal
        System.out.println(str3.equals(str4)); // equals() method to check if two strings are equal
        System.out.println(str1 == str2); // == operator to check if two string references point to the same object
        System.out.println(str3 == str4); // == operator to check if two string references point to the same object
    }
}
