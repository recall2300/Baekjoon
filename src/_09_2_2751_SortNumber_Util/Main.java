package _09_2_2751_SortNumber_Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		TreeSet<String> tree = new TreeSet<>();
		tree.add("1");
		tree.add("4");
		tree.add("2");
		queue.offer("1");
		queue.offer("2");
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1000,"사과");
		map.put(2000,"배");
		map.put(3000,"자두");
		map.put(4000,"수박");
		Set<Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Entry<Integer, String>> it = set.iterator();
		Iterator<String> it2 = queue.iterator();
		Iterator<String> it3 = tree.iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer, String> e = it.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
		
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter os = new PrintWriter(System.out);
//		int inputValue = 0;
//		try {
//			inputValue = Integer.parseInt(br.readLine());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		boolean[] valueIndex = new boolean[2000001];
//		for(int i =0 ;i<inputValue;i++){
//			try {
//				valueIndex[Integer.parseInt(br.readLine())+1000000] = true;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		for (int i = 0; i < valueIndex.length; i++) {
//			if(valueIndex[i]){
//				os.println(i-1000000);
//			}
//		}		
//			os.close();
//		try {
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}