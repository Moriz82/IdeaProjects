public class Prime
{
    public static String isPrime( int num )
    {
        boolean prime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                prime = false;
            }
        }
        if (prime){
            return num+" is prime.";
        }
        return num+" is not prime.";
    }
}