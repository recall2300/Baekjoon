package _6_2_2577_CountNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>();
		String[] words = null;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String line = br.readLine();
			words = line.split(" ");
			for(String word : words){
				if(!word.equals("")){
					wordList.add(word);
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(wordList.size());
	}
}