import java.util.Random;
public class JakeNotGay {
    public static void main(String Args[]){
        Random rand = new Random();
        int isGayRand = rand.nextInt(2);
        int ppSizeRand = rand.nextInt(8);
        String[][] isGay_ppSize = {
                {"is","isn't"},
                {"1","2","3","4","5","6","7","8"}
        };
        System.out.println("Jake "+isGay_ppSize[0][isGayRand]+" Gay, and has a pp size of "+isGay_ppSize[1][ppSizeRand]);
    }
}