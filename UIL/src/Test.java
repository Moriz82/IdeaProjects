import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        longestStreak("DGDFGDFGDFGDFSDDDDDGFDGDFG");
    }
    public static void longestStreak(String str){
        String res = "";
        int count = 0;
        int max = 0;
        char maxChar = ' ';
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if (count > max){
                    max = count+1;
                    maxChar = str.charAt(i-1);
                }
                count = 0;
            }
        }
        System.out.println(maxChar+" "+max);
    }
}

