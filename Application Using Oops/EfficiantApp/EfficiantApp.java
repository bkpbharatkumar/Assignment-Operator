import java.util.*;

abstract class Shape{
    float area;

    public abstract void input();
    public abstract void compute();
    public void disp(){
        System.out.println("The Area of Rectangle is = " + area);  
    }
}

class Rectangle extends Shape{
    float lenght;
    float width;
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
    
}

class Square extends Shape{
    float side;

    public void input(){
        System.out.println("\n_____Calculation of Square_____\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The Side of Square : ");
        side = scan.nextFloat();
    }
    
    public void compute(){
        area = side * side;
    }

}

class Circle extends Shape{
    float radius;

    public void input(){
        System.out.println("\n_____Calculation of Circle_____\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The Radius of Circle : ");
        radius = scan.nextFloat();
    }
    
    public void compute(){
        area = 3.14f * radius * radius;
    }
    
}

class Geometry{
    public void Poly(Shape ref){
        ref.input();
        ref.compute();
        ref.disp();
    }
}


public class EfficiantApp{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Circle c = new Circle();

        Geometry g = new Geometry();
        g.Poly(rec);
        g.Poly(sq);
        g.Poly(c);
        
    }
}