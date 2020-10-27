import java.io.*;
import java.util.*;

public class Lost_v2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/lost.dat"));
        int amntMazes = scan.nextInt();

        for (int i = 0; i < amntMazes; i++) {
            System.out.println(i);
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            //throw the /n because it causes errors
            scan.nextLine();
            char[][] mazeArr = new char[rows][rows];
            scan.nextLine();
            for (int j = 0; j < rows; j++) {
                String row1 = scan.nextLine();
                String row2 = scan.nextLine();
                for (int k = 0; k < columns; k++) {
                    mazeArr[0][j] = row1.charAt(j);
                    mazeArr[1][j] = row2.charAt(j);
                }//jake gay
            }
        }
    }
}
