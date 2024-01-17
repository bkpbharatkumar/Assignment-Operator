import java.util.Scanner;

class Guesser{
    int guessNum;
    public int guessingNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player{
    int pGuessNum;
    int guessingNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        pGuessNum = scan.nextInt();
        return pGuessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    public void collectNumFromPlayers(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    public void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("All Players Won The Game");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 and Player 2 Won The Game");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 1 and Player 3 Won The Game");
            }
            else{
                System.out.println("Player 1 Won The Game");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 and Player 3 Won The Game");
            }
            else{
                System.out.println("Player 2 Won The Game");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 Won The Game");
        }
        else{
            System.out.println("Lost Game ... Better Luck Next Time!");
        }

    }

}

public class LaunchGame{
    public static void main(String[] args) {
        System.out.println("Game Started --- ");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
    
}