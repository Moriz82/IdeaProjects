import java.util.Random;
public class PasswordGenerator {
	private int digits;
	private String prefix = "A";
	private static int passwordCount = 0;

	public PasswordGenerator(int digits, String prefix){
		this.digits = digits;
		this.prefix = prefix;
	}

	public PasswordGenerator(int digits){
		this.digits = digits;
	}

	public int pwCount(){
		return passwordCount;
	}

	public String pwGen(){
		double autoGenPassd = Math.random();
		int autoGenPass = 0;
		for (int i = 0; i < digits; i++) {
			autoGenPassd*=10;
		}
		autoGenPass = (int)(autoGenPassd);
		passwordCount++;
		return prefix+"."+autoGenPass;
	}
}
