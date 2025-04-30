

public class indexOf_compareTo {

    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(str.indexOf(str));// indexOf() method to get the index of first occurrence of 'o'
        System.out.println(str.lastIndexOf('o'));// lastIndexOf() method to get the index of last occurrence of 'o'
        System.out.println(str.indexOf('o', 5));// indexOf() method to get the index of first occurrence of 'o' after index 5
        System.out.println(str.lastIndexOf('o', 5));// lastIndexOf() method to get the index of last occurrence of 'o' before index 5

        String gtr = "Suraj";
        System.out.println(gtr.compareTo("Suraj"));// compareTo() method to compare two strings
        System.out.println(gtr.compareTo("Suraj Kumar"));// compareTo() method to compare two strings
    }
}