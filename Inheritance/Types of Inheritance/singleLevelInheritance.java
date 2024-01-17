class Animal{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal{

}

public class singleLevelInheritance{
    public static void main(String[] args) {
        Tiger tg = new Tiger();
        tg.sleep();
    }
}