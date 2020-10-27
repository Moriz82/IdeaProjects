import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Miner {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/miner.dat"));
        int rs = scan.nextInt();
        for (int i=0;i<rs;i++) {
            String[] dm = scan.next().split("(p:|:p)");//data in middle = dm
            System.out.println(dm[1]);
        }
    }
}