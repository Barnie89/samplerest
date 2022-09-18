package codingPractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class stringRepeatCount {
	public static void main(String[] args) {

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		String x= "Muthu";
		char[] ch1= x.toCharArray();
		for(char ch: ch1){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
			
//			Set<Entry<Character, Integer>> hs = hm.entrySet();
//			for(Entry<Character, Integer> ch2: hs) {
//				if(ch2.getValue()>1){
//					System.out.println("Duplicate Key is present "+ ch2.getKey()+" times "+ch2.getValue());
//				}
//			}
			
			//or two approaches
			Set<Character>hs= hm.keySet();
			for(char ch2:hs){
				if(hm.get(ch2)>1){
					System.out.println("Duplicate key present "+ch2);
				}
			}
			
		}
}
}