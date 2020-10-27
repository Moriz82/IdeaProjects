import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Thankyou {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/thankyou.dat"));
        int amnt = scan.nextInt();
        String weird_space = scan.nextLine();
        for (int i = 0; i < amnt; i++) {
            String name = scan.nextLine();
            System.out.println("Thank You " + name);
        }
    }
}