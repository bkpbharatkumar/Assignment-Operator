public class AssignmentOperator{
    public static void main(String [] args){
        int a,b,c,d;
        a=b=c=d=10;
        System.out.println(a+" "+b+" "+c+" "+d);
        a += 5;
        System.out.println(a);
        b -= 5;
        System.out.println(b);
        c /= 5;
        System.out.println(c);
        d *= 5;
        System.out.println(d);
    }
}