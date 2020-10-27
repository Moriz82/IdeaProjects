import java.util.Scanner;

public class GuessingGame
{
    private int upperBound;

    public GuessingGame(int stop)
    {
        upperBound = stop;
    }

    public void playGame()
    {
        int thatNum = (int) Math.floor(Math.random() * upperBound) + 1;
        int amntGuessed = 0;
        int imputNum = 0;
        Scanner scan = new Scanner(System.in);

        while (imputNum != thatNum){
            amntGuessed++;
            System.out.print("Enter a number between 1 and "+upperBound+": ");
            imputNum = scan.nextInt();
        }
        System.out.println("It took you " + amntGuessed + " guesses to guess " + thatNum);
        System.out.println("You guessed wrong "+(100/amntGuessed)+" percent of the time");
    }

    public String toString()
    {
        String output="";
        return output;
    }
}