import static java.lang.System.*;
public class Test {
    public static void main(String[] args) {
        out.println(go(7,12));
    }
    public static int go( int x, int y)
    {
        int cnt = 0;
        for(int n = x; n < y; n = n + 1)
            if(n % 2 != 0 )
                cnt++;
        return cnt;
    }



}
