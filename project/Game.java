package project;



import java.util.*;

class Guesser{
    int guessnum;


    public int takeNumberGuesser(){
        System.out.println("guesser!! please guess a number");
        Scanner sc=new Scanner(System.in);
        guessnum=sc.nextInt();
        return guessnum;
      }
}
class Player{
    int playernum;
    public int takeNumberPlayer(){
        System.out.println("player !!! please guesss a number");
        Scanner sc=new Scanner(System.in);
        playernum=sc.nextInt();
        return playernum;
      }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.takeNumberGuesser();
    }
    void CollectFromPlayer(){
        Player p1=new Player();
        numFromPlayer1=p1.takeNumberPlayer();
        Player p2=new Player();
        numFromPlayer2=p1.takeNumberPlayer();
        Player p3=new Player();
        numFromPlayer3=p1.takeNumberPlayer();
    }
    void Compare(){
        if(numFromPlayer1==numFromGuesser){
            if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser){
                System.out.println("all player won");
            }
            else if(numFromPlayer2==numFromGuesser){
                System.out.println("onlt player 1 ND 2 won the game");
            }else if(numFromPlayer3==numFromGuesser){
                System.out.println("only player 1 and 3 won the game");
            }else{
                System.out.println("only player 1 won the game");
            }
        }
        else if(numFromPlayer2==numFromGuesser){
            if(numFromPlayer3==numFromGuesser ){
                System.out.println("only player 2 and 3 won the game");
            }else{
                System.out.println("only player 2 won the game");
            }
           
        }
        else if(numFromPlayer3==numFromGuesser){
            System.out.println("only player 3 won the game");
        }
        else{
            System.out.println("no one won the game");
        }

    }
}


public class Game {
  public static void main(String[] args) {
    Umpire u=new Umpire();
    u.CollectFromGuesser();
    u.CollectFromPlayer();
    u.Compare();
  }
}
