public class Jagged_Array{
    public static void main(String[] args) {
        int arr[][] = {{3,2,1,0},{2,1},{6,5,4}};
        for(int i=0; i<=2; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}