public class TriangleFour {
    public static String go(int size, String let ) {
        String output="";
        for (int i = size; i > 0; i--) {
            for (int j = size; j > i; j--) {
                output+=" ";
            }
            for (int j = 0; i > j; j++) {
                output+=let;
            }
            output+="\n";
        }
        return output;
    }
}
