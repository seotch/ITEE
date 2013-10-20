package exercise;

public class FloatToBinary extends AbstractExercise  {
	private float maxValue = 256;
	public FloatToBinary() {
		super();
	}

	public FloatToBinary(float maxValue) {
		this();
		this.maxValue = maxValue;
	}

	
	@Override
	public void init(){
		
//		StringBuilder binary = new StringBuilder();
		
		int decimal = (int) (Math.random() * maxValue);
		question = "次の10進数を2進数に変換せよ。\n" + Integer.toString(decimal);
		answer = Integer.toBinaryString(decimal);	
	}

}
