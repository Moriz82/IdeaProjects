import java.io.*;
import java.util.*;
public class Lost_v1000 {
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
            int counter = 1;
            while(true) {
                int y = maze.path.peek().y;
                int x = maze.path.peek().x;
                maze.maze[y][x] = 0;
                //down
                if(isValid(y+1, x, maze)) {
                    if(maze.maze[y+1][x] == 'E') {
                        return counter;
                    } else if(maze.maze[y+1][x] == '.') {
                        maze.path.push(new Position(y+1, x));
                        counter++;
                        continue;
                    }
                }
                //left
                if(isValid(y, x-1, maze)) {
                    if(maze.maze[y][x-1] == 'E') { ;
                        return counter;
                    } else if(maze.maze[y][x-1] == '.') {
                        maze.path.push(new Position(y, x-1));
                        counter++;
                        continue;
                    }
                }
                //right
                if(isValid(y, x+1, maze)) {
                    if(maze.maze[y][x+1] == 'E') {
                        return counter;
                    } else if(maze.maze[y][x+1] == '.') {
                        maze.path.push(new Position(y, x+1));
                        counter++;
                        continue;
                    }
                }
                //up
                if(isValid(y-1, x, maze)) {
                    if(maze.maze[y-1][x] == 'E') {
                        return counter;
                    } else if(maze.maze[y-1][x] == '.') { ;
                        maze.path.push(new Position(y-1, x));
                        counter++;
                        continue;
                    }
                }
                counter--;
                maze.path.pop();
                System.out.println("FUCK WRONG WAY, popped back");
                if(maze.path.size() <= 0) {
                    System.out.println("Impossible");
                   break;
                }
            }
            return counter;
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