public class Enhance_For_Loop{
    public static void main(String[] args) {
        
        /*
        int arr[] = {1,2,3,4,5};
        for(int n : arr){
            System.out.println(n);
        }
        */

        int arr[][] = {{1,2,3,4},{5,6,7,8},{8,5,2,4}};
        for(int a[] : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}