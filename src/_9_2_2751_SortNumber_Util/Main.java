package _9_2_2751_SortNumber_Util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream os = new BufferedOutputStream(System.out);
		int inputValue = 0;
		try {
			inputValue = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		boolean[] valueIndex = new boolean[2000001];
		for(int i =0 ;i<inputValue;i++){
			try {
				valueIndex[Integer.parseInt(br.readLine())+1000000] = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < valueIndex.length; i++) {
			if(valueIndex[i]){
				try {
					os.write(((i-1000000)+"\n").getBytes());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}		
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}