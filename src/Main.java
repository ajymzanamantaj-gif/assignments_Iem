import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Student student = new Student(20, "Ayana", false, "CS", 3.9f);


        Human employeeHuman = new Employee(28, "Aiymzhan", false, "Developer", 4000);


        IWork employeeWork = new Employee(29, "Adilet", true, "Tester", 3000);


        student.introduce();
        student.study();
        student.takeExam();
        student.showUniversity();
        System.out.println(student.getRole());

        System.out.println("-------------------");


        employeeHuman.introduce();
        System.out.println(employeeHuman.getRole());

        System.out.println("-------------------");


        employeeWork.work();
        System.out.println("Salary: " + employeeWork.getSalary());

        System.out.println("Company: " + Employee.companyName);
    }

}