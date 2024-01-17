import java.util.Scanner;

public class Reversing3{
    public static void main(String[] args) {
        String str1;
        String str2 = "";
        String str3;
        String str4 = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String in Word : ");
        str1 = scan.nextLine();
        String sarr[] = str1.split(" ");
        
/*
        for(int i = sarr.length-1; i>=0; i--){
            str2 = str2+sarr[i]+" ";
        }
        System.out.println("Reversing User Input Word : " + str2);
        str3 = str2;
        for(int i = str3.length()-1; i>=0; i--){
            str4 = str4+str2.charAt(i);
        }
        System.out.println("Reversing Character :" + str4);
*/

        for(String element : sarr){
            for(int i = element.length()-1; i>=0; i--){
                str2 = str2+element.charAt(i);
            }
            str2 = str2 + " ";
        }
        System.out.println("Reversing Character :" + str2);

    }
}