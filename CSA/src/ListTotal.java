import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int total = 0;
		for (int i: ray) {
			total+=i;
		}
		return total;
	}
}