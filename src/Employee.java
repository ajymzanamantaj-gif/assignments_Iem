public class Employee extends Human  implements IStudy, IWork {
    private String position;
    private float salary;

    public static String companyName = "Tech Corp";

    public Employee(int age, String name, boolean isMale, String position, float salary) {
        super(age, name, isMale);
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String getRole() {
        return "I am an employee. Position: " + position;
    }
    @Override
    public void study() {
        System.out.println("Employee is learning new skills");
    }

    @Override
    public void takeExam() {
        System.out.println("Employee passed certification exam");
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public void work() {
        System.out.println("Employee works as " + position);
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



}
