class Human{            // Parent Class
    int age;
    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human     // Child Class
{

}

public class Inheritance{
    public static void main(String[] args) {
        Student std = new Student();
        std.sleep();
    }
}