interface Bharat{
    public void show();
}
interface Parihar{
    public void hide();
}

interface sanam{
    public void mahi();
}
interface javed extends sanam{
    public void hello();
}


class Name implements Bharat,Parihar {
    public void show(){
        System.out.println("Its my name");
    }
    public void hide(){
        System.out.println("Kyu Btau mera name");
    }
}


public class Implementation_Interface {
   public static void main(String[] args) {
        Name n = new Name();
        n.show();
        // n.hide();
   } 
}
