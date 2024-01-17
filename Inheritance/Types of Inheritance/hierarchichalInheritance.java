class Animal{
    void sleep(){
        System.out.println("Animal needs sleep");
    }
}

 class Tiger extends Animal{

 }

 class Monkey extends Animal{

 }

 class Lion extends Animal{

 }

public class hierarchichalInheritance{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.sleep();
    }
}