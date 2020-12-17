import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("maze"));

		int size = scan.nextInt();
		int time = scan.nextInt();
		int speed = scan.nextInt();
		scan.nextLine();
		Maze maze = new Maze();
		maze.maze = new char[size][size];

		for (int j = 0; j < size; j++) {
			String line = scan.nextLine();
			for (int k = 0; k < size; k++) {
				maze.maze[j][k] = line.charAt(k);
			}
		}

		int startRow = 0, startCol = 0;
		for (int j = 0; j < size; j++) {
			for (int k = 0; k < size; k++) {
				if (maze.maze[j][k] == 'S'){
					startRow = j;
					startCol = k;
				}
			}
		}
		maze.start = new Position(startRow, startCol);
		System.out.println(solveMaze(maze,time,speed));
	}
	private static int solveMaze(Maze maze, int time ,int speed) {
		Position p = maze.start;
		maze.path.push(p);
		int counter = 1;
		int currentTime = 0;
		while(true) {
			currentTime++;
			if (time>=currentTime){
				System.out.println("Not enough time");
				break;
			}
			int y = maze.path.peek().y;
			int x = maze.path.peek().x;
			maze.maze[y][x] = 0;
			//down
			if(isValid(y+1, x, maze)) {
				if(maze.maze[y+1][x] == 'E') {
					return counter;
				} else if(maze.maze[y+1][x] == '.'||maze.maze[y+1][x] == 'D') {
					maze.path.push(new Position(y+1, x));
					counter++;
					continue;
				}
			}
			//left
			if(isValid(y, x-1, maze)) {
				if(maze.maze[y][x-1] == 'E') { ;
					return counter;
				} else if(maze.maze[y][x-1] == '.'||maze.maze[y+1][x] == 'D') {
					maze.path.push(new Position(y, x-1));
					counter++;
					continue;
				}
			}
			//right
			if(isValid(y, x+1, maze)) {
				if(maze.maze[y][x+1] == 'E') {
					return counter;
				} else if(maze.maze[y][x+1] == '.'||maze.maze[y+1][x] == 'D') {
					maze.path.push(new Position(y, x+1));
					counter++;
					continue;
				}
			}
			//up
			if(isValid(y-1, x, maze)) {
				if(maze.maze[y-1][x] == 'E') {
					return counter;
				} else if(maze.maze[y-1][x] == '.'||maze.maze[y+1][x] == 'D') { ;
					maze.path.push(new Position(y-1, x));
					counter++;
					continue;
				}
			}
			counter--;
			currentTime--;
			maze.path.pop();
			System.out.println("FUCK WRONG WAY, popped back");
			if(maze.path.size() <= 0) {
				System.out.println("Exit is blocked.");
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