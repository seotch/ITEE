package exercise;

public class BinaryToDecimal extends AbstractExercise  {
	private int maxValue = 256;
	public BinaryToDecimal() {
		super();
	}

	public BinaryToDecimal(int maxValue) {
		this();
		this.maxValue = maxValue;
	}

	@Override
	public void init(){
		int decimal = (int) (Math.random() * maxValue);
		question = "次の2進数を10進数に変換せよ。\n" + Integer.toBinaryString(decimal);	
		answer = Integer.toString(decimal);
	}

}
