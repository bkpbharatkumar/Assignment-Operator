// Exception using Throw keyword

public class throwKeyword {
    public static void main(String[] args) {
        int n = 8;
        int n2 = -2;

        try {
            if (n2 < 0) {
                Exception e = new ArithmeticException("/ Negative Number");
                throw e;
            } 
            else {

                int result = n / n2;
                System.out.println(result);
            }
        } 
        catch (Exception e) {
            System.out.println("Please enter valid Number " + e);
        }

    }
}
