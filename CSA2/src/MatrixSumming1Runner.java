import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming1Runner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] m = {
				{ 1, 2, 3, 4, 5},
				{ 6, 7, 8, 9, 0},
				{ 6, 7, 1, 2, 5},
				{ 6, 7, 8, 9, 0},
				{ 5, 4, 3, 2, 1}};

		out.println("The sum is :: " + MatrixSumming1.sum(m));
	}
}

