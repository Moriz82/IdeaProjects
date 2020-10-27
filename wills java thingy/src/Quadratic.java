import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) throws IOException {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose an option using the letters in the brackets");
        System.out.println("[1]Input information manually");
        System.out.println("[2]Choose a file");
        System.out.print("/>");
        int fui = finput.nextInt();
        switch (fui){
            case 1:
                Input_Used();
            case 2:
                File_Used();
        }
    }
    public static void Input_Used(){

    }
    public static void File_Used() throws IOException {
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
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            //////////////////////////////////////
            double disc = Math.pow(b, 2)-(4*a*c);
            double sqrt = Math.sqrt(disc);
            double root1 = (-b+sqrt)/(2*a);
            double root2 = (-b-sqrt)/(2*a);
            double r1 = root1;
            double r2 = root2;
            //////////////////////////////////////
            System.out.println("Enter a :: "+a);
            System.out.println("Enter b :: "+b);
            System.out.println("Enter c :: "+c);
            System.out.println();
            System.out.printf("Disc :: %.0f %n", disc);
            System.out.println();
            if(disc>0) {
                System.out.println("2 Solutions");
                System.out.println();
                System.out.printf("Rootone :: %.2f %n", r1);
                System.out.printf("Roottwo :: %.2f %n", r2);
                System.out.println(spacer);
            }
            else if(disc==0){
                System.out.println("1 Solution");
                System.out.println();
                System.out.printf("Rootone :: %.2f %n", r1);
            }
            else {
                System.out.println("No Solution");
            }
        }
    }
}