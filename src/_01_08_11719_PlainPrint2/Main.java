package _01_08_11719_PlainPrint2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String arg[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try{
			while( (input=br.readLine())!=null ){
				System.out.println(input);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		try{
			br.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}