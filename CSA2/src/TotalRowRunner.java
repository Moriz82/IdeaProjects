public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] a = {{1,2,3},{5,5,5,5}};
		int[][] b = {{1,2,3},{5},{1},{2,2}};
		int[][] c ={{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};

		System.out.println("Row totals are :: "+TotalRow.getRowTotals(a));
		System.out.println("Row totals are :: "+TotalRow.getRowTotals(b));
		System.out.println("Row totals are :: "+TotalRow.getRowTotals(c));
	}
}


