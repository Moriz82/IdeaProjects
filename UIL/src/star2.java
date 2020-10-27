import java.io.*;
import java.util.*;
public class star2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/star.dat"));
        int numz = scan.nextInt();
        for (int i = 0; i < numz ; i++) {
            int amnt = scan.nextInt();
            List<ppl> pplz = new ArrayList<>();
            for (int j = 0; j < amnt ; j++) {
                pplz.add(new ppl(scan.next(), scan.nextInt()));
            }
            Collections.sort(pplz);
            System.out.println(pplz.get(0));
        }
    }
}
class ppl implements Comparable<ppl> {
    String name;
    int score;
    public ppl(String n, int s){
       this.name = n;
       this.score = s;
    }
    @Override
    public int compareTo(ppl o) {
        if(o.score == this.score){
            return this.name.compareTo(o.name);
        }
        return o.score - this.score;
    }
    @Override
    public String toString() {
        return name;
    }
}
