import java.util.*;
import java.io.*;

public class MatrixSumming1
{
	public static int sum(int[][] matrix)
	{
		int total = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				total += matrix[i][j];
			}
		}
		return total;
	}
}