package exercise;

import java.util.ArrayList;

public class ExerciseFactory implements Factory {
	private ArrayList<Exercise> exercises = new ArrayList<Exercise>();

	public ExerciseFactory() {
		
		// 各問題インスタンスを生成		
		exercises.add(new DecimalToBinary());
		exercises.add(new BinaryToDecimal());
		exercises.add(new DecimalToHex());
		exercises.add(new HexToDecimal());
		exercises.add(new BinaryToHex());
		exercises.add(new HexToBinary());
		
	}
	
	public Exercise create() {

		// 出題内容をランダムに決定
		int index = (int)(Math.random()*exercises.size());
		Exercise exercise = exercises.get(index);
		exercise.init();

		return  exercise;
	}

}
