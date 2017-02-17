package by.htp.Practics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task14 {

	public static void main(String[] args) {
		
		String str = "Tanya arrayList Vasya rita arina tom";
        
		Map<Integer, Set<String>> wordCount= new HashMap<Integer, Set<String>>();// words n counters
		for (String s: str.split("\\s+")){
			if(!wordCount.containsKey(s.length()) )
				wordCount.put(s.length(), new HashSet<String>());
				wordCount.get(s.length()).add(s);
		}
		
		Integer[] keys = wordCount.keySet().toArray(new Integer[wordCount.size()]);
		Arrays.sort(keys);
		
		System.out.print("Shortest: ");
		for (String s : wordCount.get(keys[0])){
			System.out.print(s+" ");
		}
		System.out.print("\nLongest: ");
		for (String s : wordCount.get(keys[keys.length-1])){
			System.out.print(s+" ");
		}
		System.out.println();	
	}
}
