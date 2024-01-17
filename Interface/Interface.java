interface Computer{
    public abstract void compileCode();
}

class Laptop implements Computer {
    public void compileCode(){
        System.out.println("You Got 5 Errors");
    }
}

class Desktop implements Computer {
    public void compileCode(){
        System.out.println("You Got 5 Errors, Faster");
    }

}

class Developer {
    public void buildApp(Computer obj){
        System.out.println("Building Application");
        obj.compileCode();
    }
}

public class Interface{
    public static void main(String[] args) {
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);
        
    }
}