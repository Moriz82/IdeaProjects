public class CharacterAnalyzer
{
    private char theChar;

    public CharacterAnalyzer()
    {
    }

    public CharacterAnalyzer(char c)
    {
        theChar = c;
    }

    public void setChar(char c)
    {
        theChar = c;
    }

    public char getChar()
    {
        return theChar;
    }

    public boolean isUpper( )
    {
        int ascii = theChar;
        if (ascii>=65 && ascii<=90){
            return true;
        }
        return false;
    }

    public boolean isLower( )
    {
        int ascii = theChar;
        if (ascii>=97 && ascii<=112){
            return true;
        }
        return false;
    }

    public boolean isNumber( )
    {
        int ascii = theChar;
        if (ascii>=48 && ascii<=57) {
            return true;
        }
        return false;
    }

    public int getASCII( )
    {
        int ascii = theChar;
        return ascii;
    }

    public String toString()
    {
        return ""+getChar()+" is a lowercase character. ASCII == "+getASCII()+"\n";
    }
}