import java.util.*;
import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        String str = "Hello woRld!";
        Scanner sc = new Scanner(System.in);
        StringBuilder toggledStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch)); // Convert to uppercase if lowercase
            } else if(Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch)); // Convert to lowercase if uppercase
            } else {
                toggledStr.append(ch); // Keep the character as is if it's not a letter
            }
        }
        System.out.println(toggledStr.toString()); // Print the toggled string
        System.out.println("Original String: " + str);
    }
}
