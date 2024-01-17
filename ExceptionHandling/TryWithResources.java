import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        int num = 0;
        // Scanner scan = new Scanner(System.in);

        try (Scanner scan = new Scanner(System.in)) {
            num = scan.nextInt();
            // resource close
            // scan.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter a number..");
            // resource close
            // scan.close();
        } finally {
            // scan.close();
        }
        System.err.println(num);
    }
}
