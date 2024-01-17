interface javaFeature{
    void show();
    default void config(){
        System.out.println("if method declared in inhertance we should use default keyword");
    }
    static void sanam(){
        System.out.println("No object creatation");
    }
}

public class Java8Feature {
   public static void main(String[] args) {
    javaFeature.sanam();
    // javaFeature.config();  // CE because it is non static method so create object and then use 
   } 
}
