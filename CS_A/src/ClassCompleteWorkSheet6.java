import java.io.*;
import java.util.*;

public class ClassCompleteWorkSheet6
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(new File("worksheet6.dat"));
		int runCount = Integer.parseInt(scan.nextLine());
		for(int r=1; r<=runCount; r++){

			//Construct a Pet

			Pet pet = new Pet(scan.next(), Integer.parseInt(scan.next()));

			//Print the Pet
			System.out.println(pet.toString());



		}
	}
}