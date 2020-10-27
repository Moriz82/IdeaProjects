import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Line {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter data file directory: ");
        String File = input.next();
        System.out.print("Please enter number of data sets: ");
        int amnt = input.nextInt();
        System.out.println();
        ////////////////////////////////////////////////////////////////
        String spacer = "//////////////////////////////////";
        Scanner scan = new Scanner(new File(File));
        for (int i=0;i<amnt;i++) {
            double x1 = scan.nextInt();
            double y1 = scan.nextInt();
            double x2 = scan.nextInt();
            double y2 = scan.nextInt();
            double slope = (y2-y1)/(x2-x1);
            System.out.printf("Slope is :: %.2f %n", slope);
        }
    }
}