import java.util.Scanner;

public class StudentClass {
    public static class Student{
        String name ;
        int rollno;
        double percent;
    }
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in); /// scanner is also class type


       Student suraj = new Student();
       suraj.name = "NameIsSuraj";
       suraj.rollno = 34;
       suraj.percent = 93;
       Student rahul = new Student();
       rahul.name = "nameisrahul";
       System.out.println(suraj.name +" "+suraj.rollno +" "+suraj.percent);
    }
}