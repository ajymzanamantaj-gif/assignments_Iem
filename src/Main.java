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
        Human human=new Human(age,name,isMale);
        Employee employee = new Employee(25, "Alex", true, "Developer", 3500.5f);
        Student student = new Student(18, "Aiymzhan", false, "Computer Science", 3.8f);


        System.out.println("\n--- Information ---");
        System.out.println(human.getRole());
        System.out.println(employee.getRole());
        System.out.println(student.getRole());
        System.out.println("GPA: " + student.getGpa());






    }

}