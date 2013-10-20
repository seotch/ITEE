package exercise;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 練習問題ファクトリを作成
		Factory factory = new ExerciseFactory();


		while (true) {
			
			// ファクトリから問題インスタンスをゲット
			Exercise exercise = factory.create();
			
			// 問題を表示
			System.out.println("問) " + exercise.getQuestion() + "\n");
			System.out.println("[ENTERで解答]");
			if (System.in.read() == -1) break;  // Ctrl+Dの場合は終了

			
			// 解答を表示
			System.out.println("答) " + exercise.getAnswer() + "\n");
			System.out.println("[ENTERで次の問題]" + "\n");
			if (System.in.read() == -1) break;   // Ctrl+Dの場合は終了

		}

	}

}
