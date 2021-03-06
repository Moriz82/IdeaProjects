import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
		for (int i: ray) {
			if (i > largest){
				largest = i;
			}
			if (i < smallest){
				smallest = i;
			}
		}
		return 10.1;
	}
}