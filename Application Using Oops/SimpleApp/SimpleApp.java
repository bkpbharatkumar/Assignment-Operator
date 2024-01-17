import java.util.*;

class Rectangle{
    float lenght;
    float width;
    float area;

    public void input(){
        System.out.println("\n_____Calculation of Rectangle_____\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The Length of Rectangle : ");
        lenght = scan.nextFloat();
        System.out.print("Please Enter The Width of Rectangle : ");
        width = scan.nextFloat();
    }
    
    public void compute(){
        area = lenght * width;
    }
    
    public void disp(){
        System.out.println("The Area of Rectangle is = " + area);

    }
}

class Square{
    float side;
    float area;

    public void input(){
        System.out.println("\n_____Calculation of Square_____\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The Side of Square : ");
        side = scan.nextFloat();
    }
    
    public void compute(){
        area = side * side;
    }
    
    public void disp(){
        System.out.println("The Area of Square is = " + area);

    }
}

class Circle{
    float radius;
    float area;

    public void input(){
        System.out.println("\n_____Calculation of Circle_____\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The Radius of Circle : ");
        radius = scan.nextFloat();
    }
    
    public void compute(){
        area = 3.14f * radius * radius;
    }
    
    public void disp(){
        System.out.println("The Area of Circle is = " + area);

    }
}

public class SimpleApp{
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle c = new Circle();
        c.input();
        c.compute();
        c.disp();

    }
}