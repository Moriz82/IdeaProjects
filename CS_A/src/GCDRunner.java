public class GCDRunner
{
    public static void main ( String[] args )
    {
        GCD g = new GCD();
        //add test cases
        System.out.println(
                g.getGCD(5,25)+"\n"+
                g.getGCD(4,400)+"\n"+
                g.getGCD(8,80)+"\n"+
                g.getGCD(15,45)+"\n"+
                g.getGCD(6,66)+"\n"+
                g.getGCD(9,9)+"\n"+
                g.getGCD(9,543)+"\n"+
                g.getGCD(15,40)+"\n"+
                g.getGCD(6,51)
        );
    }
}