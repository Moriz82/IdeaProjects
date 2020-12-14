import java.util.*;

public class AdditionPattern {
	private int currentNum = 0;
	private int amnt = 0;
	public AdditionPattern(int s, int a){
		currentNum = s;
		amnt = a;
	}
	public int currentNumber(){
		return currentNum ;
	}
	public void next(){
		currentNum +=amnt;
	}
	public void prev(){
		if (currentNum > amnt){
			currentNum -= amnt;
		}
	}
}