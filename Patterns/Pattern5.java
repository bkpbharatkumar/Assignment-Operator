public class Pattern5{
    public static void main(String [] args){
        int n=20;
          for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==j || i+j==n+1 || i+j==n/2+1 || i-j==n/2 || j-i==n/2 || i+j==n+n/2 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
           System.out.println(); 
          }
    }
}