class Car implements Runnable{
  /* synchronized */ public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+" Has Enter the Parking Area");
            Thread.sleep(2000);
            synchronized(this)
            {
            System.out.println(Thread.currentThread().getName()+" Go into the car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came back and parked the car");
            }

            
        } catch (Exception e) {
            System.out.println("Some Technical Issue");
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Car c = new Car();

        Thread th = new Thread(c);
        Thread th2 = new Thread(c);
        Thread th3 = new Thread(c);

        th.setName("Son-1");
        th2.setName("Son-2");
        th3.setName("Son-3");

        th.start();
        th2.start();
        th3.start();

    }
}
