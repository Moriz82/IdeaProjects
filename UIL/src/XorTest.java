public class XorTest {

	private static int passNum = 0;

	public static void main(String[] args) {
		String str = "password";

		str = encryptDecryptXOR(str);
		System.out.println(str);
		str = encryptDecryptXOR(str);
		passNum++;
		System.out.println(str);

		str = encryptDecryptXOR(str);
		System.out.println(str);
		str = encryptDecryptXOR(str);
		passNum++;
		System.out.println(str);

		str = encryptDecryptXOR(str);
		System.out.println(str);
		str = encryptDecryptXOR(str);
		passNum++;
		System.out.println(str);
	}
	public static String encryptDecryptXOR(String inputStr){
		String[] xorKeys = {"sdERIUVB","JVNRU", " irgh eriuwh", "slafEUGISV"};
		String outputStr = "";
		int keyIndex = 0;

		if (passNum > xorKeys.length-1){
			passNum = 0;
		}

		for (int i = 0; i < inputStr.length(); i++)
		{
			keyIndex++;
			if (xorKeys.length-1 < keyIndex){
				keyIndex = 0;
			}
			outputStr += Character.toString((char) (inputStr.charAt(i) ^ xorKeys[passNum].charAt(keyIndex)));
		}

		return outputStr;
	}
}
