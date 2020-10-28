import java.util.Scanner;

public class monsterRunner
{
    public static void main( String args[] )
    {
        //create scanner so we can take keyboard input
        Scanner scan = new Scanner(System.in);

        //Initiate m1n(monster name 1) and m2n(monster name 2)
        String mn1,mn2;
        //Initiate ms1(monster size 1) amd s2(monster size 2)
        int ms1,ms2;

        //ask for name and size
        //get first monsters name
        System.out.println("Enter 1st monster's name : ");
        //store the name to m1n
        mn1 = scan.nextLine();
        //get first monsters size
        System.out.println("Enter 1st monster's size : ");
        //store the size to m1s
        ms1 = scan.nextInt();

        //instantiate monster one with name mn1 and size ms1
        Monster m1 = new Monster(mn1, ms1);

        //ask for name and size
        //get second monsters name
        System.out.println("Enter 2nd monster's name :");
        //store second monsters name
        mn2 = scan.nextLine();
        //get second monsters size
        System.out.println("Enter 2nd monster's size :");
        //store second monsters size
        ms2 = scan.nextInt();

        //instantiate monster two with name mn2 and size ms2
        Monster m2 = new Monster(mn2, ms2);

        //create output
        //im gonna stop writing comments because you probably know whats going on
        System.out.println(m1.getName()+" "+m1.getHowBig());
        System.out.println(m2.getName()+" "+m2.getHowBig());
        if (m1.isBigger(m2)){
            System.out.println("Monster one is bigger than Monster two.");
        }
        else{
            System.out.println("Monster one is smaller than Monster two.");

        }
        if (m1.namesTheSame(m2)){
            System.out.println("Monster one has the same name as Monster two.");
        }
    }
}