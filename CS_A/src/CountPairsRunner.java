public class CountPairsRunner
{
    public static void main( String[] args )
    {
        System.out.println(
                CountPairs.pairCounter("test_cases")+"\n"+
                CountPairs.pairCounter("ddogccatppig")+"\n"+
                CountPairs.pairCounter("dogcatpig")+"\n"+
                CountPairs.pairCounter("xxyyzz")+"\n"+
                CountPairs.pairCounter("a")+"\n"+
                CountPairs.pairCounter("abc")+"\n"+
                CountPairs.pairCounter("aabb")+"\n"+
                CountPairs.pairCounter("dogcatpigaabbcc")+"\n"+
                CountPairs.pairCounter("aabbccdogcatpig")+"\n"+
                CountPairs.pairCounter("dogabbcccatpig")+"\n"+
                CountPairs.pairCounter("aaaa")+"\n"+
                CountPairs.pairCounter("AAAAAAAAA")+"\n"
        );
        //add in all of the provided test cases from the lab handout
    }
}