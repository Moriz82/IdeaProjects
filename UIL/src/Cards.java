import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cards {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/cards.dat"));
        int amnt  = scan.nextInt();
        for (int i = 0 ; i < amnt ; i++) {
            String[] thing = scan.next().split("\\d");
            int total = 52;
            for (int j = 0 ; j < thing.length ; j++) {
                total -= thing[j].length();
            }
            System.out.println(total);
        }
    }
}