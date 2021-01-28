class StringRemover
{
    private String remove;
    private String sentence;
    private String str;
    private int whereRemove;

    public StringRemover( String sen, String rem )
    {
        sentence = sen;
        remove = rem;
    }

    public void removeStrings()
    {
        str = sentence;
        whereRemove = sentence.indexOf(remove);
        while (whereRemove>-1)
        {
            sentence = sentence.substring(0, whereRemove-1) + sentence.substring(whereRemove+remove.length());
            whereRemove = sentence.indexOf(remove);
        }
    }

    public String toString()
    {
        return str + " - String to remove " + remove + ", Output: "+sentence;
    }
}