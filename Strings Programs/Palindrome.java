import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        String str1;
        String str2 = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = scan.nextLine();
        for(int i=str1.length()-1; i>=0; i--){
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("Given is a Palindrome String.");
        }
        else{
            System.out.println("Given is not a Palindrome String.");

        }
    }
}