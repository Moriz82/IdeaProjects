import java.io.*;
import java.util.*;

public class Lost_v2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/lost.dat"));
        int amntMazes = scan.nextInt();
        for (int i = 0; i < amntMazes; i++) {
            int amntSpaces = 2;
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            //throw the /n because it causes errors
            scan.nextLine();
            char[][] mazeArr = new char[rows][rows];
            for (int j = 0; j < rows; j+=2) {
                boolean found = false;
                String row1 = scan.nextLine();
                String row2 = scan.nextLine();
                for (int k = 0; k < columns; k++) {
                    mazeArr[0][j] = row1.charAt(j);
                    mazeArr[1][j] = row2.charAt(j);
                }
                for (int k = 0; k < columns; k++) {
                    if (mazeArr[0][k] == mazeArr[1][k] && !found){
                        amntSpaces += k+1;
                        found = true;
                    }
                }
            }
        }
    }
}
