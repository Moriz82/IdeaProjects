public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int distance = -1;
		boolean isOdd = false, hasEnd = false;
		for (int i = 0; i < ray.length; i++) {
			if (!(ray[i]%2==0)){
				isOdd = true;
			}
			if (isOdd){
				distance++;
				if (ray[i]%2==0){
					hasEnd = true;
					break;
				}
			}
		}
		if (!hasEnd){
			return -1;
		}
		return distance;
	}
}