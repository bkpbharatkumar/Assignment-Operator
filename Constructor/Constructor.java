class Cons{
    private int a, b;

    public Cons(){
        System.out.println("Zero parameterized constructor by programmer");
    }

    public Cons(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class Constructor{
    public static void main(String[] args) {
        Cons c1 = new Cons();
        c1.show();
        Cons c2 = new Cons(5,8);
        c2.show();
    }
}