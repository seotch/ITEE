package exercise;

public class BinaryToHex extends AbstractExercise {
	private int maxValue = 256;
	public BinaryToHex() {
		super();
	}
	
	public BinaryToHex(int maxValue) {
		this();
		this.maxValue = maxValue;
	}
	
	@Override
	public void init(){
		int decimal = (int) (Math.random() * maxValue);
		question = "次の2進数を16進数に変換せよ。\n" + Integer.toBinaryString(decimal);
		answer = Integer.toHexString(decimal);	
	}

}
