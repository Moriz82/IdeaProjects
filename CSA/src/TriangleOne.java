public class TriangleOne {
    public static String go(String letter, int amnt){
        String output = "";
        for (int i = 0; i <= amnt; i++) {
            for (int j = 0; j < i; j++) {
                output+=letter;
            }
            output+="\n";
        }
        return output;
    }
}
