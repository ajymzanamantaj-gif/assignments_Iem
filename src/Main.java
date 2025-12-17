import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Is male? (True/False): ");
        boolean isMale = sc.nextBoolean();

        Employee employee = new Employee(30, "Alex", true, "Developer", 3500.5f);
        Student student = new Student(20, "Anna", false, "Computer Science", 3.8f);


    }

}