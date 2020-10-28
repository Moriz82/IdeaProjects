import static java.lang.System.*;
import java.util.Scanner;

public class characterRunner
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        out.print("Enter a letter :: ");
        char letter = scan.next().charAt(0);
        CharacterAnalyzer test = new CharacterAnalyzer(letter);
        out.println(test);   //A

        //add more test cases

        out.println(test.toString());
    }
}