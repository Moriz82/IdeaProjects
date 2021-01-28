public class AngryBear {
    private static int daysAwake, amntTeeth;

    public AngryBear( int one, int two ) {
        daysAwake = one;
        amntTeeth = two;
    }

    public static boolean isAngry() {
        if (daysAwake>=3 && amntTeeth < 10){
            return true;
        }
        if (amntTeeth == 0){
            return true;
        }
        if (daysAwake > 5){
            return true;
        }
        else {
            return false;
        }
    }
}