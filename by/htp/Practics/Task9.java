package by.htp.Practics;

import java.util.HashMap;
import java.util.Map;

public class Task9 {

	public static void main(String[] args) {
		
		String text = " Hello, my friend! hello friend .Hello my sun!";
		text = text.toLowerCase(); 
		text = text.replaceAll("[-.?!)(,:]", "");
		String[] words = text.split("\\s");
		
		Map<String, Integer> counterMap = new HashMap<>();
		for (String word : words){
			if(!word.isEmpty()){
				Integer count = counterMap.get(word);
				if(count == null){
					count = 0;
				}
				counterMap.put(word, ++count);
			}
		}
		for(String word : counterMap.keySet()){
			System.out.println(word+ ": " + counterMap.get(word));
		}
	}
}
