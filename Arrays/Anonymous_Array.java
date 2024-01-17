class Calc{
    public int add(int nums[]) {
        int result = 0;
        for(int n : nums){
            result += n;
        }
        return result;
    }
}


public class Anonymous_Array{
    public static void main(String[] args) {       
        Calc obj = new Calc();
        int result = obj.add(new int[]{1,2,3,4,5}); /* It is called Anonymous Array */
        System.out.println(result);
    }
}
