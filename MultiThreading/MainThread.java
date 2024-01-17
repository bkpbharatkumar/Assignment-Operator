// package MultiThreading;


public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before Changing");
        String name = Thread.currentThread().getName();
        System.out.println("The Name of main thread - "+name);
        System.out.println("The Priority of main thread - "+ Thread.currentThread().getPriority());

        System.out.println("---------------------------------------------");

        System.out.println("After Change");
        Thread t = Thread.currentThread();
        t.setName("Bkp");
        t.setPriority(1);
        String name2 = Thread.currentThread().getName();
        System.out.println("The Name of main thread - " + name2);
        System.out.println("The Priority of main thread - " + Thread.currentThread().getPriority());

    }
}
