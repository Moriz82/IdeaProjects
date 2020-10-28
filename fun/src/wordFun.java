public class wordFun
{
    private String word;

    public wordFun(String w)
    {
        word = w;
    }

    public void makeUpper()
    {
        System.out.println(word.toUpperCase());
    }

    public void addHyphen()
    {
        System.out.println(word.replace(" ", "-"));
    }

    public String toString()
    {
        return word;
    }
}