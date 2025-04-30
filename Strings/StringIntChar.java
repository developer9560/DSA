public class StringIntChar {
    public static void main(String[] args) {
      String str = "Hello world!";
      str = str + " Suraj Kumar"; // Concatenating strings using + operator
      System.out.println(str); // Printing the concatenated string
      str+=5; // Concatenating string with integer using += operator
      System.out.println(str); // Printing the concatenated string with integer
      System.out.println("abc"+10+40); // Concatenating string with integers using + operator
      System.out.println("abc"+(10+40)); // Concatenating string with sum of integers using + operator
      System.out.println(10+40+"abc"); // Concatenating integers with string using + operator

    }
}
