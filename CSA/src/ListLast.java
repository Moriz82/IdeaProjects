import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
		boolean moreThanOnce = false;
		int last = ray.get(ray.size()-1);

		for (int i = 0; i < ray.size()-2; i++) {
			if (ray.get(i) == last){
				moreThanOnce= true;
			}
		}

		return moreThanOnce;
	}
}