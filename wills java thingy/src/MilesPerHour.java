import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MilesPerHour {
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
            int dist = scan.nextInt();
            int hr = scan.nextInt();
            int mins = scan.nextInt();
            long mph = Math.round((dist)/(hr + (mins/60.0)));
            System.out.println("Enter the distance :: "+dist);
            System.out.println("Enter the hours :: "+hr);
            System.out.println("Enter the minutes :: "+mins);
            System.out.println(dist+" miles in "+hr+" hour(s) and "+mins+" minutes = "+mph+" MPH.");
            System.out.println(spacer);
        }
    }
}