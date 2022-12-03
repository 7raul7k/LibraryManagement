package ro.myClass.models;

public class Student extends User {
    private int yearStudying;
    private int age;

    public Student(String firstName, String lastName,String email,String password,int yearStudying, int age) {
        super("student", firstName, lastName,email,password);
        this.yearStudying = yearStudying;
        this.age = age;
    }
    public Student(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.yearStudying = Integer.parseInt(proprietes[4]);
        this.age = Integer.parseInt(proprietes[5]);
    }

    public String description(){
        String text = super.description();
        text += "\n Year of studying: " + yearStudying;
        text += "\n Age: " + age;
        text += "\n=========================================\n";
        return text;
    }

    @Override
    public String toString(){
        return super.toString()+","+yearStudying+","+age;
    }

    public int getYearStudying() {
        return yearStudying;
    }

    public void setYearStudying(int yearStudying) {
        this.yearStudying = yearStudying;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
