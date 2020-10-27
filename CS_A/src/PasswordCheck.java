import java.util.Scanner;

class PasswordCheck
{
    private String password;

    public PasswordCheck()
    {
        password = "N0tP@$$w0rd";
    }

    public void check()
    {
        String pass = "";
        Scanner scan = new Scanner(System.in);
        while (!password.equals(pass)){
            System.out.print("Enter The Password :: ");
            pass = scan.nextLine();
            if (!pass.equals(password)){
                System.out.println("INVALID");
            }
        }
        System.out.println("VALID");
    }
}