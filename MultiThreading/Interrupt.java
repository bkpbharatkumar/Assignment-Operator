class Display extends Thread{
    public void run(){
        for(int i=1; i<3; i++){
        try {
                System.out.println("Focus is Important");
                Thread.sleep(3000);
            }
            
        catch (Exception e) {
            System.out.println("Some Problem");
        }
    }
}
}
public class Interrupt {
    public static void main(String[] args) {
        Display d = new Display();

        d.start();
        d.interrupt();
    }
}

