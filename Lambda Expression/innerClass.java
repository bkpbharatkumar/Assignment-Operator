// Inner class ===> Member, Static, Anonymous


class person{
    String name;
    int age;

    public void show(){
        System.out.println("What's your name");
    }

    class Bharat{
        public void Disp(){
            System.out.println("My name is Bkp");
        }
    }
}

public class innerClass {
   public static void main(String[] args) {
    person p = new person();
    person.Bharat b = p.new Bharat();
    p.show();
    b.Disp();
   } 
}
