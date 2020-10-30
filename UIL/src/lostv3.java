import java.io.*;
import java.util.*;

public class lostv3 {
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
            //checks if it doesnt have am even amount of rows
            if (!(rows%2 == 0)){
                scan.nextLine();
            }
            //creates a multidimensional array to store both string as chars
            char[][] mazeArr = new char[rows][rows];
            for (int j = 1; j < rows; j+=2) {
                //bool for if it finds the first opening and row1 and row2 for 2 rows at a time
                boolean found = false;
                String row1 = scan.nextLine();
                String row2 = scan.nextLine();
                //putting strings in array 1 char at a time
                for (int k = 0; k < columns; k++) {
                    mazeArr[0][k] = row1.charAt(k);
                    mazeArr[1][k] = row2.charAt(k);
                }
                //checking for matching chars in the same place

                }
            }
            //System.out.println("amnt "+amntSpaces);
        }
    }

