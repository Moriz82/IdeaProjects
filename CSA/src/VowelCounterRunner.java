public class VowelCounterRunner
{
    public static void main ( String[] args )
    {
        System.out.println(
                VowelCounter.getNumberString("abcdef")+"\n"+
                VowelCounter.getNumberString("hhhhhhh")+"\n"+
                VowelCounter.getNumberString("aaaaaaa")+"\n"+
                VowelCounter.getNumberString("catpigdatrathogbogfrogmoosegeese")+"\n"+
                VowelCounter.getNumberString("hhhhhhh1234356HHHHDH")+"\n"+
                VowelCounter.getNumberString("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj")+"\n"+
                VowelCounter.getNumberString("")+"\n"+
                VowelCounter.getNumberString("x")+"\n"+
                VowelCounter.getNumberString("e")
        );
        //add more test cases
    }
}