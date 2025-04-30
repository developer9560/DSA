public class toLowerCase_toUpperCase_contact {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str.toLowerCase()); // toLowerCase() method to convert string to lowercase
        System.out.println(str.toUpperCase()); // toUpperCase() method to convert string to uppercase
        System.out.println(str.trim()); // trim() method to remove leading and trailing whitespace
        System.out.println(str.replace("o", "a")); // replace() method to replace 'o' with 'a'
        System.out.println(str.replaceAll("o", "a")); // replaceAll() method to replace all occurrences of 'o' with 'a'
        System.out.println(str.replaceFirst("o", "a")); // replaceFirst() method to replace first occurrence of 'o' with 'a'
        System.out.println(str.split(" ")); // split() method to split the string into an array of strings
        String[] arr = str.split(" "); // split() method to split the string into an array of strings 
        for (String s : arr) {
            System.out.println(s); // print each element of the array
        }
         System.out.println(str.equalsIgnoreCase("hello world!")); // equalsIgnoreCase() method to check if two strings are equal ignoring case  
    }
}
