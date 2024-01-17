/* Array Index Out Of Bounds Exception */

public class Array_Exception{
    public static void main(String[] args) {
        int nums[] = {5,3,7,6};
       // System.out.println(nums[4]);
       // System.out.println(nums[nums.length-1]);
       // System.out.println("Bye");
      /* for(int i=0; i<nums.length; i++){
        System.out.println(nums[i]);
    }
    */
    for(int n : nums){
        System.out.println(n);
    }
    }
}