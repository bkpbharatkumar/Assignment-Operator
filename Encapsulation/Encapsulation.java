class student{
    // int age;
    // String name;

    private int age;
    private String name;

    public void setData(){
        age = 22;
        name = "Bharat";
    }

    public void Show(){
        System.out.println(name + " " + age);
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        student std = new student();
        // std.age = 22;
        // std.name = "Bharat";
        std.setData();
        std.Show();
    }
}