
public class CharAtANDlength {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Length of the string: " + str.length()); // length() method to get the length of the string
        char ch = str.charAt(0); // charAt() method to get the character at index 0
        System.out.println("Character at index 0: " + ch);

        char ch1[] = str.toCharArray(); // toCharArray() method to convert string to character array
        System.out.println("Character array: ");
        for (char c : ch1) {
            System.out.print(c + " ");
        }
    }
    
}