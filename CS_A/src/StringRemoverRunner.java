public class StringRemoverRunner
{
    public static void main(String[] args) {
        StringRemover strR = new StringRemover("xR-MxR-MHelloxR-M","R-M");
        strR.removeStrings();
        System.out.println(strR.toString());
    }
}