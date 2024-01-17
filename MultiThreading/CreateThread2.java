import java.util.*;

class Calc extends Thread{
    int A,B;
    public void run(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("________________Calculation Thread________________");
            System.out.println("Enter The value of A - ");
            A = scan.nextInt();
            System.out.println("Enter The value of A - ");
            B = scan.nextInt();
            int Result = A+B;
            System.out.println("Addition of A and B is - " + Result);
        }
        catch(Exception e){
            System.out.println("Some Problem");
        }

    }
}

class Disp extends Thread{
    public void run(){
        System.out.println("________________Display Thread________________");
        try{
            for(int i = 1; i<5; i++){
                System.out.println("I am The Best");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println("Some Dikkt");
        }
    }

}

public class CreateThread2 {
    public static void main(String[] args) {
        System.out.println("It is a Main Thread");
        Calc c = new Calc();
        Disp d = new Disp();
        c.start();
        d.start();
    }
}
