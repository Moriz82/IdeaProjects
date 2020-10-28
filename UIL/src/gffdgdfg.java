
import java.io.*;
import java.util.*;

public class gffdgdfg {
    public static void main(String[] args) throws IOException {
        //scanner for the file
        Scanner scan = new Scanner(new File("student/lost.dat"));
        //amnt of mazes
        int amntMazes = scan.nextInt();
        //for each maze take the amnt of rows and make amnt spaces = 3
        for (int i = 0; i < amntMazes; i++) {
            int amntSpaces = 2;
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            //throw the /n because it causes errors
            scan.nextLine();
            //creates a multidimensional array to store both string as chars
            char[][] mazeArr = new char[rows][rows];
            String[] Rows = new String[rows];
            for (int k = 0; k < rows; k++) {
                Rows[k] = scan.nextLine();
            }
            for (int j = 1; j < rows; j++) {
                //bool for if it finds the first opening and row1 and row2 for 2 rows at a time
                boolean found = false;
                //putting strings in array 1 char at a time
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < rows; l++) {
                        mazeArr[k][l] = Rows[k].charAt(l);
                    }
                }
                //checking for matching chars in the same place
                for (int k = 0; k < columns; k++) {
                    if (mazeArr[j][k] == mazeArr[j-1][k] && !found) {
                        amntSpaces += k;
                        found = true;
                    }
                }
            }
            System.out.println("amnt "+amntSpaces);
        }
    }
}
