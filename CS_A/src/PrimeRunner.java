public class PrimeRunner
{
    public static void main ( String[] args )
    {
        Prime p = new Prime();
        //add test cases
        System.out.println(
                p.isPrime(24)+"\n"+
                p.isPrime(7)+"\n"+
                p.isPrime(100)+"\n"+
                p.isPrime(113)+"\n"+
                p.isPrime(65535)+"\n"+
                p.isPrime(2)+"\n"+
                p.isPrime(7334)+"\n"+
                p.isPrime(7919)+"\n"+
                p.isPrime(1115125003)+"\n"
        );
    }
}