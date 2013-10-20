package exercise;

public class HexToBinary extends AbstractExercise  {
	private int maxValue = 256;
	public HexToBinary() {
		super();
	}

	public HexToBinary(int maxValue) {
		this();
		this.maxValue = maxValue;
	}

	@Override
	public void init(){
		int decimal = (int) (Math.random() * maxValue);
		question = "次の16進数を2進数に変換せよ。\n" + Integer.toHexString(decimal);	
		answer = Integer.toBinaryString(decimal);
	}

}
