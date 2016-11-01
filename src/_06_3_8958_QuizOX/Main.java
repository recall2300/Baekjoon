package _06_3_8958_QuizOX;

import java.util.Scanner;

public class Main {
	public static int getGrade(String questionResult){
		int totalGrade = 0;
		String[] correct = null;
		correct = questionResult.split("X");
		for(int i=0; i<correct.length;i++){
			for(int j=1; j<=correct[i].length();j++){
				totalGrade += j;
			}
		}
		return totalGrade;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] questionList = null;
		int questionCount;
		
		questionCount = Integer.parseInt(scan.nextLine());
		questionList = new String[questionCount];
		for(int i=0; i<questionCount;i++){
			questionList[i] = scan.nextLine();
		}
		
		
		for(int i=0;i<questionList.length;i++){
			System.out.println(getGrade(questionList[i]));
		}
		
	}

}
