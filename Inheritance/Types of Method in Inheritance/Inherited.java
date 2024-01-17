class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class cargoPlane extends Aeroplane{

// Inheritance

}

class passengerPlane extends Aeroplane{

}

public class Inherited{
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        cp.takeOff();
        cp.fly();

        passengerPlane pp = new passengerPlane();
        pp.takeOff();
        pp.fly();
    }
}