import java.util.Scanner;

public class GuessRunner
{
    public static void main(String args[])
    {
        String YorN = "y";
        while (YorN.equals("y") || YorN.equals("Y")){
            Scanner scan = new Scanner(System.in);
            System.out.print("Guessing Game - how many numbers? ");
            int startNum = scan.nextInt();
            GuessingGame gg = new GuessingGame(startNum);
            gg.playGame();
            System.out.print("Would you like to play again?[y/n]: ");
            YorN = scan.next();
        }
    }
}