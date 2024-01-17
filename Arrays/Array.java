public class Array{
    public static void main(String[] args) {
        // int arr[] = {14,15,16,17,18};
        int arr[] = new int [10];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        arr[5] = 10;
        String names[] = {"Bharat", "Deepak", "Paras", "Surendra", "Laby"};
        for(int i=0; i<=5; i++){
            System.out.println(arr[i]);
        }

            System.out.println(" ");
            
        for(int i=0; i<=5; i++){
            System.out.println(names[i]);
        }
    }
}