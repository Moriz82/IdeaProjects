import static java.lang.System.*;

public class WordFunRunner
{
    public static void main( String args[] )
    {
        wordFun test = new wordFun("Hello World");
        out.println(test);
        test.makeUpper();
        out.println(test);
        test.addHyphen();
        out.println(test);

        //add more test cases

        out.println(test.toString());
    }
}