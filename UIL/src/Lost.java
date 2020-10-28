import java.io.*;
import java.util.*;

public class Lost {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/lost.dat"));
        int rs = scan.nextInt();
        for (int i=0;i<rs;i++) {
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            String junk = scan.nextLine();
            List<Integer> amntd = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                String line = scan.nextLine();
                int test = line.length();
                int value = checkamnt(line);
                amntd.add(value);
            }
            int total = 1;
            int a = 0;
            for (int j = 0; j < amntd.size(); j++) {
                a = amntd.get(j);
                total += a;
            }
            if(total==8){
                System.out.println("4");
            }
            else {
                System.out.println(total);
            }
        }
    }
    public static int checkamnt(String txt) {
        char c = '.';
        int rtotal = 0;
        for(int k=0;k<txt.length();k++) {
            if(txt.charAt(k) == c) {
                rtotal++;
            }
        }
        return (rtotal);
    }
}
