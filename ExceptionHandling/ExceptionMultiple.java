// package ExceptionHandling;


public class ExceptionMultiple {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        String str = null;
        int value [] = {2,4,5,6};
        
        try{
            result = num1/str.length();
            result = num1/num2;
            System.out.println(value[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(value[value.length-1]);
            System.out.println("Stay in your limits");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero " + e);
        }
        catch(NullPointerException  e){
            System.out.println("please give string value and then try");
        }
        catch(Exception  e){
            System.out.println("Retry" + "\n" + "Something Went Wrong");
        }


    }
}
