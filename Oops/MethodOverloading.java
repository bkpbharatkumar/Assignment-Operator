class Clc{
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }
    public static int add(int a, int b, int c) {
        int result = a+b+c;
        return result;
    }
}


public class MethodOverloading{
    public static void main(String[] args) {
        Clc obj = new Clc();
        int result = obj.add(2,5);
        int result2 = obj.add(2,3,4);
        System.out.println(result);
        System.out.println(result2);
    }
}