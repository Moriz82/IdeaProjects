import java.util.Scanner;

public class tweetRunner
{
    public static void main(String args[])
    {
        tweet sample = new tweet( "aplus", 0, 0 );
        sample.addLikes( 3 );
        sample.addRetweets( 28 );
        System.out.println( sample.notLiked() );
        System.out.println( sample.kindaLiked() );
        sample.addLikes( 35 );
        System.out.println( sample.kindaLiked() );
        System.out.println( sample.isTrending() );
        sample.addLikes( 13 );
        sample.addRetweets( 47 );
        System.out.println( sample.notLiked() );
        System.out.println( sample.kindaLiked() );
        System.out.println( sample.isTrending() );
        System.out.println( sample );

        //add more test code
        System.out.println(sample.toString());
        if (sample.isTrending()){
            System.out.println("My tweet is trending");
        }
        else{
            System.out.println("My tweet is not trending");
        }
    }
}