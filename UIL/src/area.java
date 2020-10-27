import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class area {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/area.dat"));//file location
        int amnt = scan.nextInt();
        for (int i=0;i<amnt;i++) {
            double f = scan.nextDouble();
            double s = scan.nextDouble();
            double a = f*s;
            System.out.printf("%.2f %n", a);
        }
    }
}
