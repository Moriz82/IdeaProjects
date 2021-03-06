import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go( List<Integer> ray)
	{
		int first = ray.get(0);
		int total = 0;
		for (int i : ray) {
			if (i > first){
				total+=i;
			}
		}
		if (total==0){
			return -1;
		}
		return total;
	}
}