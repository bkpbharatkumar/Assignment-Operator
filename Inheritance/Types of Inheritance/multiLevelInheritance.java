class Demo1{
    void disp(){
        System.out.println("Display written in Demo1 class");
    }
}

 class Demo2 extends Demo1{

 }

 class Demo3 extends Demo2{

 }

public class multiLevelInheritance{
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.disp();
    }
}