import java.util.*;

class MyException extends Exception{

}

class FaceBook{
   String username = "iambkp";
   int password = 8090;
   String conformUsername;
   int conformPassword;

   public void intput(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Your Username...");
      conformUsername = scan.next();
      System.out.println("Enter Your Password...");
      conformPassword = scan.nextInt();
   }

   public void validation() throws MyException{
      if(conformUsername.equalsIgnoreCase(username) && conformPassword==password){
         System.out.println("Bkp, Welcome to your Account");
      }
      else{
         MyException ME = new MyException();
         throw ME;
      }
   }

   
}

class FBCompany{
   public void checking(){
      FaceBook FB = new FaceBook();
      FB.intput();
      try{
         FB.validation();
      }
      catch(MyException e){
         System.out.println("Wrong Password, Try again...");
         try{
            FB.validation();
         }
         catch(MyException se){
            System.out.println("Wrong Password, Try again...");
            try{
               FB.validation();
            }
            catch(MyException te){
               System.out.println("This is not your account, Bye...");
            }
         }
      }
   }
}
public class Login {
   public static void main(String[] args) {
      FBCompany FBC = new FBCompany();
      FBC.checking();

   } 
}
