import javax.swing.event.SwingPropertyChangeSupport;

interface car{
    void drive();
}

// class nano implements car{
//     public void drive(){
//         System.out.println("Driving...");
//     }
// }


public class AnonymousInnerClass {
    public static void main(String[] args) {
        car obj = new car(){
            public void drive(){
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}
