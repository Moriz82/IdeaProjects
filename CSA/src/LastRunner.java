import java.util.Arrays;

public class LastRunner
{
	public static void main( String args[] )
	{
		System.out.println( ListLast.go( Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5)));
		System.out.println( ListLast.go( Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		System.out.println( ListLast.go( Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		System.out.println( ListLast.go( Arrays.asList(32767)));
		System.out.println( ListLast.go( Arrays.asList(7,7,7,7)));
		System.out.println( ListLast.go( Arrays.asList(9,10,-88,100,-555,1000)));
	}
}