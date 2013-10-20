package exercise;

public class HexToDecimal extends AbstractExercise  {
	private int maxValue = 256;
	public HexToDecimal() {
		super();
	}
	
	public HexToDecimal(int maxValue) {
		this();
		this.maxValue = maxValue;
	}

	@Override
	public void init(){
		int decimal = (int) (Math.random() * maxValue);
		question = "次の16進数を10進数に変換せよ。\n" + Integer.toHexString(decimal);	
		answer = Integer.toString(decimal);
	}

}
