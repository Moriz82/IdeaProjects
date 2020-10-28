public class tweet
{
    private String msg;
    //add 2 more instance variables
    private int retweets, likes;
    public tweet( String m, int r, int lk )
    {
        //finish the constructor
        msg = m;
        retweets = r;
        likes = lk;
    }

    public void addLikes( int n )
    {
        //code
        likes += n;
    }

    public void addRetweets( int n )
    {
        //code
        retweets += n;
    }

    public boolean notLiked()
    {
        if (likes<10){
            return true;
        }
        return false;
    }

    public boolean kindaLiked()
    {
        if (likes>retweets){
            return true;
        }
        return false;
    }

    public boolean isTrending()
    {
        if (retweets+likes>75){
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "msg: "+msg+" retweets: "+retweets+" likes: "+likes;
    }
}