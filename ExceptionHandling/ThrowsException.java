// Handling vs Ducking the Exception..

class Demo {
    public void a() throws Exception {
        // try{
        b();
        // }
        // catch(Exception e){
        // // Handle Exception
        // }
    }

    public void b() throws Exception {
        int a = 8;
        int b = 0;
        int result = 0;

        // try{
        result = a / b;
        // }
        // catch(Exception e){
        // // Handle Exception
        // }
        System.out.println(result);
    }
}

public class ThrowsException {
    public static void main(String[] args) {
        Demo obj = new Demo();

        try {
            obj.a();
        } catch (Exception e) {
            System.out.println("Error...");
        }

    }
}
