package exercise;

public class DecimalToBinary extends AbstractExercise  {
	private int maxValue = 256;
	
	public DecimalToBinary() {
		super();
	}
	
	public DecimalToBinary(int maxValue) {
		this();
		this.maxValue = maxValue;
	}

	@Override
	public void init(){
		int decimal = (int) (Math.random() * maxValue);
		question = "次の10進数を2進数に変換せよ。\n" + Integer.toString(decimal);
		answer = Integer.toBinaryString(decimal);	
	}

}
