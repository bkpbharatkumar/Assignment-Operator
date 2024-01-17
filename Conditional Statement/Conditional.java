public class Conditional{
    public static void main(String [] args){
        int age = 5;
        if(age>=18 && age<=60){
            System.out.println("Your are an Adult");
        }
        else if(age<=18 && age>=13){
            System.out.println("Your are an Teenager");    
        }
        else if(age>=60 && age<=100){
            System.out.println("Your are an Old Man");    

        }
        else {
            System.out.println("Your are a Kid");   
        } 
        
    }
}