import java.util.*;
public class Intro {

    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        // next() method to read a single word
        //nextLine() method to read a line of text
        // String str = sc.nextLine();

        // System.out.println(str.length());

        String s = "Hello World!";

        char ch = s.charAt(0);// charAt() method to get the character at index 0

        System.out.println(ch);
        int i = s.indexOf('o');// indexOf() method to get the index of first occurrence of 'o'
        System.out.println(i);

        int j = s.lastIndexOf('o');// lastIndexOf() method to get the index of last occurrence of 'o'
        System.out.println(j);

        String s1 = s.substring(0, 5);// substring() method to get the substring from index 0 to 5
        System.out.println(s1);
        String gtr ="Suraj";
        String str = "Kumar";
        System.out.println(str.compareTo(gtr));// compareTo() method to compare two strings
        System.out.println(str.equals(gtr));// equals() method to check if two strings are equal

    }
}
