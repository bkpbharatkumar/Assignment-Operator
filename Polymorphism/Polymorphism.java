class Bike{
    public void Run(){
        System.out.println("Running");
    }
    public void Avg(){
        System.out.println("Bike Average");
    }
}

class Splendor extends Bike{
    public void Run(){
        System.out.println("Splendor Runs like train");
    }
    public void Avg(){
        System.out.println("It's Average 60 kmpl");
    }
}

class HondaSP extends Bike{
    public void Run(){
        System.out.println("HondaSP Runs Very Fast");
    }
    public void Avg(){
        System.out.println("It's Average 65 kmpl");
    }
}

class BajajCT extends Bike{
    public void Run(){
        System.out.println("BajajCT Runs Good");
    }
    public void Avg(){
        System.out.println("It's Average 75 kmpl");
    }
}

class Vehicle{
    public void Poly(Bike ref){
        ref.Run();
        ref.Avg();
        System.out.println("-----------------------------");    
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Splendor sp = new Splendor();
        HondaSP hsp = new HondaSP();
        BajajCT bct = new BajajCT();

        Vehicle vh = new Vehicle();
        vh.Poly(sp);
        vh.Poly(hsp);
        vh.Poly(bct);

        // sp.Run();
        // sp.Avg();

        // hsp.Run();
        // hsp.Avg();

        // bct.Run();
        // bct.Avg();
    }
}