public class Strings{
    public static void main(String[] args) {
     String brand = "PwSkill";
     brand.concat("Vidhyapith");
     System.out.println(brand);   
     System.out.println(brand); 

     System.out.println();

     StringBuilder brand1 = new StringBuilder("PwSkill2");
     System.out.println(brand1);  
     brand1.append("Vidhyapith2");
     System.out.println(brand1);  
    }
}