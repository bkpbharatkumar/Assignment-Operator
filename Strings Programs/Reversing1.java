import java.util.Scanner;

public class Reversing1{
    public static void main(String[] args) {
        String str1; // Bharat
        String str2 = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = scan.nextLine();

        for(int i = str1.length()-1; i>=0; i--){
            str2 = str2+str1.charAt(i);
        }
        System.out.println("Before Reversing : " + str1); // Bharat
        System.out.println("After Reversing : " + str2); // tarahB
    }
}