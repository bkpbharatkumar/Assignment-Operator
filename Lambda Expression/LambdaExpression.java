interface car{
    // void Drive();

    // void Drive(int age);

    void Person(String name, int age);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // car c = ()->System.out.println("Driving...");
        // c.Drive();

        // car c = (age) -> System.out.println("Driving..." + age);
        // c.Drive(18);

        car p = (name,age) -> System.out.println("Name = "+ name + "\n" + "Age = "+ age);
        p.Person("Bharat",22);
    }
}
