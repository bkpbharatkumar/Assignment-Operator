class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class cargoPlane extends Aeroplane{
    public void fly(){
       System.out.println("Aeroplane is flying in the sky"); // Overridden
    
   }
}

class passengerPlane extends Aeroplane{
    public void fly(){
        System.out.println("Aeroplane is flying in the sky"); //  Overridden
     
    }  
}

public class overridden{
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        cp.takeOff();
        cp.fly();

        passengerPlane pp = new passengerPlane();
        pp.takeOff();
        pp.fly();
    }
}