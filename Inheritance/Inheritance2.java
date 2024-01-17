class Human2{
    private String name;
    int age;

    Human2(){
        System.out.println("This is a class Constructor");
    }
    
    void sleep(){
        age = 22;
        System.out.println("Human needs good sleep");
        System.out.println(age);
        
    }
}

class Student2 extends Human2{
    // public Student2(){
    //     super();
    // }

    void show(){
        System.out.println("Age is = "+age);   
        // System.out.println("Name is = "+name);   // Compile Error
    }
}

public class Inheritance2{
    public static void main(String[] args) {
        Student2 std2 = new Student2();
        std2.sleep();
        std2.show();
    }
}