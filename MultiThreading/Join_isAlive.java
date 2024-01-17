class printing implements Runnable{

    public void run(){
        try {
            for(int i=1; i<3; i++){
                System.out.println("Focus is Important");
                Thread.sleep(3000);
            }
            
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
    }

}

public class Join_isAlive {
    public static void main(String[] args) throws Exception{
        System.out.println("It is a main thread");

        printing p = new printing();

        Thread th = new Thread(p);
        System.out.println(th.isAlive()); // false

        th.start();
        System.out.println(th.isAlive()); // True
        th.join(); // jb tk thread complete nhi ho jata main thread finish nhi hoga

        System.out.println("Main thread finished");
    }
}
