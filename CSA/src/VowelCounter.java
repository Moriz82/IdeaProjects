public class VowelCounter
{
    public static String getNumberString( String str) {
        int count = 0;
        String newStr = "";
        for (int i = 0; i <= str.length()-1; i++) {
            char letter = str.charAt(i);
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                newStr += count;
                count++;
                if (count > 9){
                    count = 0;
                }
            }
            else {
                newStr += letter;
            }
        }
        return newStr;
    }
}