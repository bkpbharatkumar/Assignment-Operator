import java.util.*;

public class Anagram{
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = scan.nextLine();
        System.out.print("Enter a another String : ");
        str2 = scan.nextLine();
        
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");
        
        System.out.println();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();
        
        
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("It`s an Anagram String.");

        }
        else{
        System.out.println("It`s not an Anagram String.");
        }
        


    }
}