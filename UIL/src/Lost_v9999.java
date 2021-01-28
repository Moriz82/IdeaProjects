import java.io.*;
import java.util.*;
public class Lost_v9999 {
    //wall = #
    //path = .
    //start = S
    //end = E
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/lost.dat"));
        int amntMazes = scan.nextInt();
        for (int i = 0; i < amntMazes; i++) {
            System.out.println("Maze #"+(i+1));
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            scan.nextLine();
            Maze maze = new Maze();
            maze.maze = new char[rows][columns];
            for (int j = 0; j < rows; j++) {
                String line = scan.nextLine();
                for (int k = 0; k < columns; k++) {
                    maze.maze[j][k] = line.charAt(k);
                }
            }
            int startRow = 0, startCol = 0;
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    if (maze.maze[j][k] == 'S'){
                        startRow = j;
                        startCol = k;
                    }
                }
            }
            maze.start = new Position(startRow, startCol);
            System.out.println(solveMaze(maze));
        }
    }
    private static int solveMaze(Maze maze) {
        Position p = maze.start;
        maze.path.push(p);
        int y = maze.path.peek().y;
        int x = maze.path.peek().x;
        int counter = 1;
        while(true) {
            if (checkAll(y,x,maze).equals("keep_going")){
                counter++;
            }
            if (checkAll(y,x,maze).equals("end")){
                return counter;
            }
            if(maze.path.size() <= 0) {
                System.out.println("Impossible");
                break;
            }
        }
        return counter;
    }
    public static String checkAll(int y, int x, Maze maze){
        int[] down = {y+1, x};
        int[] left = {y, x-1};
        int[] right = {y, x+1};
        int[] up = {y-1,x};
        int[] direction = {};
        if (isValid(down[0],down[1], maze)){
            direction = down;
        }
        else if (isValid(left[0],left[1], maze)){
            direction = left;
        }
        else if (isValid(right[0],right[1], maze)){
            direction = right;
        }
        else if (isValid(up[0],up[1], maze)){
            direction = up;
        }
        if (maze.maze[direction[0]][direction[1]] == 'E'){
            return "end";
        }
        else if(maze.maze[direction[0]][direction[1]] == '.'){
            maze.path.push(new Position(direction[0], direction[1]));
            return "keep_going";
        }
        maze.path.pop();
        System.out.println("FUCK WRONG WAY, popped back");
        return "NOT GOOD CHECK DID A BAD";
    }
    public static boolean isValid(int y, int x, Maze m) {
        if(y < 0 || y >= m.maze.length || x < 0 || x >= m.maze[y].length) {
            return false;
        }
        return true;
    }
}
class Maze {
    public char[][] maze;
    public LinkedList<Position> path = new LinkedList<Position>();
    public Position start;
}
class Position {
    public int x;
    public int y;

    public Position(int y, int x) {
        this.x = x;
        this.y = y;
    }
}