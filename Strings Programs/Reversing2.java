import java.util.Scanner;

public class Reversing2{
    public static void main(String[] args) {
        String str1; // Bkp Bharat Parihar
        String str2 = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String in words : ");
        str1 = scan.nextLine();
        // For split of string we create an array 
        String sarr[] = str1.split(" ");
        for(int i = sarr.length-1; i>=0; i--){
            str2 = str2 + sarr[i] + " ";
        } 
        System.out.println("Before Reversing : " + str1); // Bkp Bharat Parihar
        System.out.println("After Reversing : " + str2); // Parihar Bharat Bkp

    }
}