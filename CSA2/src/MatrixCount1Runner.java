public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] m = {{ 1, 2, 3, 4, 5},
				{ 6, 7, 8, 9, 0},
				{ 6, 7, 1, 2, 5},
				{ 6, 7, 8, 9, 0},
				{ 5, 4, 3, 2, 1}};

		System.out.println("The 7 count is :: " + MatrixCount1.count(m, 7));
		System.out.println("The 8 count is :: " + MatrixCount1.count(m, 8));
		System.out.println("The 6 count is :: " + MatrixCount1.count(m, 6));
		System.out.println("The 21 count is :: " + MatrixCount1.count(m, 21));
	}
}
