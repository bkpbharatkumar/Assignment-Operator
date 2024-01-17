import java.util.Scanner;

class MyThread extends Thread {
    
    public void run() {
        String str = Thread.currentThread().getName();
        if(str.equals("Calc")){
            Calc();
        }
        else{
            Disp();
        }
    }
    
    int A, B;
    public void Calc() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("________________Calculation Thread________________");
            System.out.println("Enter The value of A - ");
            A = scan.nextInt();
            System.out.println("Enter The value of B - ");
            B = scan.nextInt();
            int Result= A+B;
            System.out.println("Addition of A and B is - " + Result);
        } 
        catch (Exception e) {
            System.out.println("Some Problem");
        }
    }

    public void Disp() {
        System.out.println("________________Display Thread________________");
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("I am The Best");
                Thread.sleep(3000);
            }
        } 
        catch (Exception e) {
            System.out.println("Some Dikkt");
        }
    }
}

public class SingleRun {
    public static void main(String[] args) {

        System.out.println("It is a main Thread");

        MyThread MT = new MyThread();
        MyThread MT2 = new MyThread();

        MT.setName("Calc");
        MT2.setName("Disp");

        MT.start();
        MT2.start();
    }
}
