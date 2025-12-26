public final class Student extends Human  implements IStudy {
    private String major;
    private float gpa;
    public final String universityName = "AITU";


    public Student(int age, String name, boolean isMale, String major, float gpa) {
        super(age, name, isMale);
        this.major = major;
        this.gpa = gpa;
    }


    @Override
    public void study() {
        System.out.println("Student is studying " + major);
    }

    @Override
    public void takeExam() {
        System.out.println("Student is taking an exam");
    }


    @Override
    public String getRole() {
        return "I am a student";
    }


    public final void showUniversity() {
        System.out.println("University: " + universityName);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }



}
