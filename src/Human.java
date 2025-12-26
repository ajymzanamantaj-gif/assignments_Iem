public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isMale;


    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;}


    public abstract String getRole();
    public void introduce() {
        System.out.println("Hi, my name is " + name);
    }
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public boolean isMale() {
        return isMale;
    }
    public void setMale(boolean male) {
        isMale = male;}

}
