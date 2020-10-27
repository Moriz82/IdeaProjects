import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/coins.dat"));
        int rs = scan.nextInt();
        for (int i=0;i<rs;i++) {
            int cs = scan.nextInt();//coins
            int numc = scan.nextInt();//number of coins
            int[] coins = new int[numc];
            for (int c=0;c<numc;c++) {
                coins[c] = scan.nextInt();
            }
            System.out.println((check(coins, 0, cs))?"Possible":"Not Possible"); //ternary operator//not mine
        }
    }
    public static boolean check(int[] cns, int rt, int ev){
        if(rt == ev){
            return true;
        }
        for (int j=0;j<cns.length;j++) {
            if(cns[j]+rt<=ev){
                rt+=cns[j];
                if(check(cns,rt,ev)){
                    return true;
                }
                rt-=cns[j];
            }
        }
        return false;
    }
}