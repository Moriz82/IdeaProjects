import java.util.*;

public class TotalRow
{
	public static List<Integer> getRowTotals( int[][] m )
	{
		ArrayList<Integer> RowTotals = new ArrayList<Integer>();

		for (int i = 0; i < m.length; i++) {
			int rowTotal = 0;
			for (int j = 0; j < m[i].length; j++) {
				rowTotal+=m[i][j];
			}
			RowTotals.add(rowTotal);
		}
		return RowTotals;
	}
}