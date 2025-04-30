public class containes_startWith {

    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(str.contains("world"));// contains() method to check if the string contains "world"
        System.out.println(str.startsWith("Hello"));// startsWith() method to check if the string starts with "Hello"
        System.out.println(str.endsWith("world!"));// endsWith() method to check if the string ends with "world!"
    }
}