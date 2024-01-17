import java.util.*;

class Farmer{
    int principleAmmount;
    float timeDuration;
    float rateOfInterest;
    float simpleInterest;

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please mention the Ammount of Required = ");
        principleAmmount = scan.nextInt();
        System.out.print("Please mention time Duration of Required = ");
        timeDuration = scan.nextFloat();

        rateOfInterest = 8.5f;
    }

    void compute(){
        simpleInterest = (principleAmmount*rateOfInterest*timeDuration)/100f;
    }

    void display(){
        System.out.println("Simple Interest is = " + simpleInterest);
    }

}

public class Static_Application{
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.display();
    }
}