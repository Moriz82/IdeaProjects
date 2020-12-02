import java.util.*;
import java.io.*;


public class Chem_Reactions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		reaction reactions = new reaction();

		System.out.print("Enter amount of elements in reaction: ");
		reactions.setAmntElements(Integer.parseInt(scan.nextLine()));
		System.out.print("Enter amount of compounds in 1st part: ");
		reactions.setAmntCompounds1(Integer.parseInt(scan.nextLine()));
		System.out.print("Enter amount of compounds in 2st part: ");
		reactions.setAmntCompounds2(Integer.parseInt(scan.nextLine()));
		System.out.print("Enter element abbreviations with spaces between them: ");
		String[] elements = scan.nextLine().split(" ");
		System.out.print("Enter equation with spaces between compounds and a > to signal the second part(no other operators than >): ");
		String[] compounds = scan.nextLine().split(" ");

		reactions.setArrs();

		for (int i = 0; i < reactions.amntElements; i++) {
			element el = new element(0,elements[i]);
			reactions.elements[0][i] = el;
			reactions.elements[1][i] = el;
		}
		for (int i = 0; i < reactions.amntCompounds1; i++) {
			reactions.compounds[0][i] = compounds[i];
		}
		int fun = 0;
		for (int i = reactions.amntCompounds1+1; i < reactions.amntCompounds2 + reactions.amntCompounds1+1; i++) {
			reactions.compounds[1][fun] = compounds[i];
			fun++;
		}

		for (int i = 0; i < reactions.amntCompounds1-1; i++) {
			for (int j = 0; j < reactions.amntElements-1; j++) {
				int index = reactions.compounds[0][i].indexOf(reactions.elements[0][j].abbreviation);
				if (index != -1 && index+3 <= reactions.compounds[1][i].length()){
					try{
						reactions.elements[0][j].amount += Integer.parseInt(reactions.compounds[0][i].substring(index+2,index+3));
					}
					catch (Exception e){
						reactions.elements[0][j].amount += 1;
					}
				}
			}
		}
		for (int i = 0; i < reactions.amntCompounds2-1; i++) {
			for (int j = 0; j < reactions.amntElements-1; j++) {
				int index = reactions.compounds[1][i].indexOf(reactions.elements[1][j].abbreviation);
				if (index != -1 && index+3 <= reactions.compounds[1][i].length()){
					try{
						reactions.elements[1][j].amount += Integer.parseInt(reactions.compounds[1][i].substring(index+2,index+3));
					}
					catch (Exception e){
						reactions.elements[1][j].amount += 1;
					}
				}
			}
		}
		//System.out.println(reactions.compounds[0][1].indexOf(reactions.elements[0][2].abbreviation));
		for (int i = 0; i < reactions.amntElements; i++) {
			System.out.println(reactions.elements[0][i].amount);
		}
		System.out.println();
		for (int i = 0; i < reactions.amntElements; i++) {
			System.out.println(reactions.elements[1][i].amount);
		}
	}
}
 class reaction{
	int amntCompounds1, amntCompounds2, amntElements;
	element[][] elements;
	String[][] compounds;

	 public void setAmntCompounds1(int amntCompounds1) {
		 this.amntCompounds1 = amntCompounds1;
	 }

	 public void setAmntCompounds2(int amntCompounds2) {
		 this.amntCompounds2 = amntCompounds2;
	 }

	 public void setAmntElements(int amntElements) {
		 this.amntElements = amntElements;
	 }
	 public void setArrs(){
		 elements = new element[2][amntElements];
		 if (amntCompounds1>=amntCompounds2){
			 compounds = new String[2][amntCompounds1];
		 }
		 else{
			 compounds = new String[2][amntCompounds2];
		 }
	 }
 }
class element{
	int amount;
	String abbreviation;
	public element(int amt, String abv){
		amount = amt;
		abbreviation = abv;
	}
}