public class ArithmeticOperator{
       public static void main(String[] args){
        System.out.println("size of byte is = " + Byte.SIZE + " bits");
        System.out.println("size of Short is = " + Short.SIZE + " bits");
        System.out.println("size of Integer is = " + Integer.SIZE + " bits");
        System.out.println("size of Long is = " + Long.SIZE + " bits");
        System.out.println("size of Float is = " + Float.SIZE + " bits");
        System.out.println("size of Double is = " + Double.SIZE + " bits");
        // System.out.println("size of Boolean is = " + Boolean.SIZE + " bits");
        System.out.println("size of Character is = " + Character.SIZE + " bits");

        int a = 10;
        int b = 5;
        System.out.println("Addtion is = "+ (a+b));
        System.out.println("Subtraction is = "+ (a-b));
        System.out.println("Multiplication is = "+ (a*b));
        System.out.println("Division is = "+ (a/b));
        System.out.println("Modulus is = "+ (a%b));
        System.out.println("Post Increment is = "+ (a++));
        System.out.println("Pre Increment is = "+ (++a));
        System.out.println("Post Decrement is = "+ (b--));
        System.out.println("Pre Decrement is = "+ (--b));
    }
}