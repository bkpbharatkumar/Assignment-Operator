// package static;

class Demo1{

    // Static Variable
    static int a;
    static int b;

    // Non-Static Variable or Instance Variable
    int m;
    int n;

    static
    {
    
        // Initialize static variable
        a = 10;
        b = 20;
        System.out.println("Control in static block");
        
    }
    
    // Java Initialization Block
    
    {
        m = 100;
        n = 200;
        System.out.println("Control in Non-Static block");
        
    }
    
    static void disp1(){
    System.out.println("Value of static variable = "+ a);
    System.out.println("Value of static variable = "+ b);
    }

    void disp2(){
    System.out.println("Value of Non-Static or Instance variable = "+ m);
    System.out.println("Value of Non-Static or Instance variable = "+ n);
    }

}

public class Static{
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1.disp1();
        d.disp2();

    }
}