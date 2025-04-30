import java.util.*;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world!");
        System.out.println(str); // Print the original string
        str.append(" How are you?"); // Append a string to the original string
        System.out.println(str); // Print the modified string
        str.insert(5, " beautiful"); // Insert a string at index 5
        System.out.println(str); // Print the modified string
        str.replace(5, 15, ""); // Replace a substring from index 5 to 15 with an empty string
        System.out.println(str); // Print the modified string
        str.delete(5, 15); // Delete a substring from index 5 to 15
        System.out.println(str); // Print the modified string
        str.setCharAt(0, 'M'); // Set the character at index 0 to 'H'
        System.out.println(str); // Print the modified string
        str.reverse(); // Reverse the string
        System.out.println(str); // Print the reversed string
    }
}
