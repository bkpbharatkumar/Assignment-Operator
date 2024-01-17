public class Array_2D{
    public static void main(String[] args) {
     int num [][] = new int [3][2];
       /* num[0][0]=5;
        num[0][1]=6;
        num[1][0]=7;
        num[1][1]=8;
        num[2][0]=9;
        num[2][1]=10; */

      int num2 [][] = {{5,6},{7,8},{9,10}};

     for(int i=0; i<=2; i++){
        for(int j=0; j<=1; j++){
            System.out.print(num2[i][j] + " ");
        }
        System.out.println();

     }  
    }
}