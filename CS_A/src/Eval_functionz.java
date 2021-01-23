import java.util.Scanner;

public class Eval_functionz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter functions in order they are evaluated");
		System.out.println("Enter function 1(with out the f(x)= and make the variable as x): ");
		String f1 = scan.nextLine();
		System.out.println("Enter function 2(with out the f(x)= and make the variable as x): ");
		String f2 = scan.nextLine();
		System.out.print("Enter the Function to be solved: ");
		functionEvaluator FE = new functionEvaluator(scan.nextLine(),f1,f2);
		FE.evaluate();
	}
}
class functionEvaluator {
	String funkz = "", f1 = "", f2= "";
	functionEvaluator(String funkz,String f1,String f2){
		this.funkz = funkz;
		this.f1 = f1;
		this.f2 = f2;
	}
	public void evaluate(){
		String first = funkz.substring(funkz.indexOf("("), funkz.lastIndexOf(")"));
		String num = first.substring(funkz.indexOf("(")+2,funkz.indexOf(")")-1);
		
	}
}
