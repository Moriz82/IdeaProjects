public class RayGetFirst {
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static int[] go(int[] ray) {
		int[] arr = new int[]{0,0,0};
		int amnt = 0;

		for (int i = 0; i < ray.length; i++) {
			if (ray[i]>11&&amnt!=3){
				arr[amnt] = ray[i];
				amnt++;
			}
		}

		return arr;
	}
}