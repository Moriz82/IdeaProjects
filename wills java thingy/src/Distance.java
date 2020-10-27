import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Distance {
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
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            double distance = dist_cal(x1,y1,x2,y2);
            System.out.println("Enter X1 :: "+x1);
            System.out.println("Enter Y1 :: "+y1);
            System.out.println("Enter X2 :: "+x2);
            System.out.println("Enter Y2 :: "+y2);
            System.out.printf("distance == %.3f %n", distance);
            System.out.println(spacer);
        }
    }
    public static double dist_cal(int x1, int y1, int x2, int y2){
        double dis = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        return dis;
    }
}