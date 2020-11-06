public class GCD {
    public String getGCD(int one, int two){
        long res = 1;
        for (int i = 1; i <= one && i<=two; i++) {
            if (one % i == 0 && two % i == 0){
                res = i;
            }
        }
        return "the gcd of "+one+" and "+two+" is "+res;
    }
}
