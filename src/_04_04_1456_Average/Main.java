package _04_04_1456_Average;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		int totalSubject = scan.nextInt();
		float[] subject = new float[totalSubject];
		float max = -1;
		float totalValue = 0;
		float result = 0;
		for (int i = 0; i < totalSubject; i++) {
			subject[i] = scan.nextFloat();
			if (max < subject[i]) {
				max = subject[i];
			}
		}
		for (int i = 0; i < totalSubject; i++) {
			subject[i] = subject[i] / max * 100;
		}
		for (int i = 0; i < totalSubject; i++) {
			totalValue += subject[i];
		}
		result = totalValue / totalSubject;
		System.out.println(df.format(result));
	}
}
