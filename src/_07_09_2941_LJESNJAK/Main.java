package _07_09_2941_LJESNJAK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] LJESNJAK = {"c=","c-","dz=","d-","lj","nj","s=","z="}; 
		String input = scan.nextLine();
		int result = 0;
		for(int i=0;i<LJESNJAK.length;i++){
			String comp = input.replaceFirst(LJESNJAK[i], "1");	
			if(comp != input){
				result++;
				i--;
				input = comp;
				continue;
			}
		}
		input = input.replaceAll("1", "");
		System.out.println(input.length()+result);
	}
}
