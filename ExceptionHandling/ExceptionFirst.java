public class ExceptionFirst {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;

        try{
            result = num1/num2;
        }
        catch(Exception e){
            System.out.println("Something Went Wrong...");            
            System.out.println("Try Again...");            

        }

        System.out.println(result);
        System.out.println("Bye Exception");
    }
}
