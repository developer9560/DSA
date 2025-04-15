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


      Student s3 = new Student();
      System.out.println("Enter the name of student 3: ");
      s3.name = sc.nextLine();
      System.out.println("Enter the roll number of student3 : ");
      s3.rollno = sc.nextInt();
      System.out.println("Enter the percentage of student 3: ");
      s3.percent = sc.nextDouble();
      System.out.println("Name of student 3 is: " + s3.name+ " Roll number is: " + s3.rollno + " Percentage is: " + s3.percent);
      sc.nextLine(); // consume the newline character left by nextDouble() 
    }
}