public class Triples
{
	private int number;

	public Triples(int num)
	{
		number = num;
	}

	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = Math.max(a,Math.max(b,c));
		for(int i=max/2;i>=2;i--)
		{
			if(a%i==0&&b%i==0&&c%i==0)
				return i;
		}
		return 1;
	}
	public String toString()
	{
		String output = "";
		for(int i = 1; i<=number-2;i++){
			for(int j = i+1; j<=number-1;j++){
				for(int k = j+1; k<=number;k++){
					if((Math.pow(i,2)+Math.pow(j,2))==Math.pow(k,2)){
						if (!(k%2==0)){
							if (i%2==0 && !(j%2==0) || !(i%2==0) && j%2==0){
								if (greatestCommonFactor(i,j,k)<=1){
									output += i+" "+j+" "+k+"\n";
								}
							}
						}
					}
				}
			}
		}
		return output+"\n";
	}
}