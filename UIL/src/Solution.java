import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int startCol = scan.nextInt();
		int startRow = scan.nextInt();
		int amntMaze = scan.nextInt();
		scan.nextLine();

		char[][] maze = new char[startCol][startCol];
		int[][] solvePoints = new int[amntMaze][amntMaze+1];

		String rowLn = "";
		for (int i = 0; i < startRow; i++) {
			rowLn = scan.nextLine();
			for (int j = 0; j < rowLn.length(); j++) {
				maze[i][j] = rowLn.charAt(j);
			}
		}
		for (int i = 0; i < amntMaze; i++) {
			for (int j = 0; j < 4; j++) {
				solvePoints[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < amntMaze; i++) {
			System.out.println(solveMaze(maze, solvePoints[i][0], solvePoints[i][1], solvePoints[i][2], solvePoints[i][3]));
		}

	}

	public static int solveMaze(char[][] maze ,int startR, int startC, int endR, int endC){
		Queue<nodes> queue = new LinkedList<>();
		boolean[][] beenThere = new boolean[maze.length][maze[0].length];
		int[][] pDis = new int[maze.length][maze[0].length];

		queue.add(new nodes(startR, startC));

		char walkable = maze[startR][startC];

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				pDis[i][j] = Integer.MAX_VALUE;
			}
		}
		pDis[startR][startC] = 0;

		while(true){
			nodes currentNode = queue.poll();
			int cRow = currentNode.getRow();
			int cCol = currentNode.getCol();

			if (cRow == endR && cCol == endC){
				for (int i = 0; i < maze.length; i++) {
					for (int j = 0; j < maze[0].length; j++) {
						System.out.println(pDis[i][j]);
					}
				}
				return 1;
			}
			beenThere[cRow][cCol] = true;

			//down
			if (cRow+1 != maze.length && !beenThere[cRow+1][cCol] && maze[cRow+1][cCol] == walkable){
				queue.add(new nodes(cRow+1, cCol));
				if (cRow-1 != -1  cCol != -1){
					if (pDis[cRow][cCol] > pDis[cRow-1][cCol-1]+1){
						pDis[cRow][cCol] = pDis[cRow-1][cCol-1]+1;
					}
				}
			}
			//left
			if (cCol-1 != -1 && !beenThere[cRow][cCol-1] && maze[cRow][cCol-1] == walkable){
				queue.add(new nodes(cRow, cCol-1));
				if (cRow-1 != -1&& cCol != -1){
					if (pDis[cRow][cCol] > pDis[cRow-1][cCol-1]+1){
						pDis[cRow][cCol] = pDis[cRow-1][cCol-1]+1;
					}
				}
			}
			//right
			if (cCol+1 != maze[0].length && !beenThere[cRow][cCol+1] && maze[cRow][cCol+1] == walkable){
				queue.add(new nodes(cRow, cCol+1));
				if (cRow-1 != -1&& cCol != -1){
					if (pDis[cRow][cCol] > pDis[cRow-1][cCol-1]+1){
						pDis[cRow][cCol] = pDis[cRow-1][cCol-1]+1;
					}
				}
			}
			//up
			if (cRow-1 != -1 && !beenThere[cRow-1][cCol] && maze[cRow-1][cCol] == walkable){
				queue.add(new nodes(cRow-1, cCol));
				if (cRow-1 != -1&& cCol != -1){
					if (pDis[cRow][cCol] > pDis[cRow-1][cCol-1]+1){
						pDis[cRow][cCol] = pDis[cRow-1][cCol-1]+1;
					}
				}
			}
		}
	}
}
class nodes{
	private int col, row, distanceFromStart;

	public nodes(int row, int col) {
		this.col = col;
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}
}