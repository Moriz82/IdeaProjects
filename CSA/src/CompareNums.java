public class CompareNums
{
    private int bob, ann;

    public CompareNums(int beg, int end) {
        bob = beg;
        ann = end;
    }

    public void setNums(int beg, int end) {
        bob = beg;
        ann  = end;
    }

    //returns true if bob and ann have the same value
    //returns false if bob and ann do not have the same value
    public boolean compare() {
        if (bob == ann) {
            return true;
        }
        return false;
    }

    //returns bob and ann are equal if bob and ann have the same value
    //returns bob and ann are not equal if bob and ann do not have the same value
    public String toString() {
        if (bob == ann){
            return bob+" and "+ann+" are equal";
        }
        return bob+" and "+ann+" are not equal";
    }
}
