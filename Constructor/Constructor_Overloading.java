class Student1{
    private int age;
    private String name;

    public Student1(){
        System.out.println("Default Constructor is called");
        name = "Bharat";
        age = 22;
    }
    
    public Student1(int age){
        this.age = age;
        name = "Rishu";
    }
    
    public Student1(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void show(){
        System.out.println(name + " - " + age);
    }
}

public class Constructor_Overloading{
    public static void main(String[] args) {
        Student1 std1 = new Student1();
        std1.show();
        Student1 std2 = new Student1(3);
        std2.show();
        Student1 std3 = new Student1(2, "Rudra");
        std3.show();
    }
}