package Main;


public class Run {
	
	public static void main(String[] args) {
		
		BinPower binpower = new BinPower();
		binpower.setBinary();
		
		HexDecBin baseConverter = new HexDecBin();
	
		baseConverter.setHexNumber();
		baseConverter.convert();
	}
}