package exercise;

public class DecimalToHex extends AbstractExercise  {
	private int maxValue = 256;
	public DecimalToHex() {
		super();
	}

	public DecimalToHex(int maxValue) {
		this();
		this.maxValue = maxValue;
	}

	@Override
	public void init(){
		int decimal = (int) (Math.random() * maxValue);
		question = "次の10進数を16進数に変換せよ。\n" + Integer.toString(decimal);
		answer = Integer.toHexString(decimal);	
	}

}
