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
       public void carryGoods(){
        System.out.println("CarryGoods are expensive"); // Specialized

    }
    
   }


class passengerPlane extends Aeroplane{
    public void fly(){
        System.out.println("Aeroplane is flying in the sky"); //  Overridden
    }
        public void carryPassenger(){
        System.out.println("Aeroplane is carry Passenger"); //  Specialized
        
    }
    }  


public class specialized{
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();

        passengerPlane pp = new passengerPlane();
        pp.takeOff();
        pp.fly();
        pp.carryPassenger();
    }
}