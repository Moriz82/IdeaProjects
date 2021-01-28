public class MultTens {
    public static String go(int x){
        if (x <= 0){
            return "aplus";
        }
        String output = "";
        for (int i = 1; i <= x; i++) {
            output += 10*i;
        }
        return output;
    }
}
