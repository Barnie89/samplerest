package codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateElementinList {

	public static void main(String[] args) {
		
		String [] words= {"muthu","rajesh","padma","muthu"};
		List<String> original= Arrays.asList(words);
		ArrayList<String> duplicate= new ArrayList<String>();
		
		for(String elem: original){
			if(!duplicate.contains(elem)){
			duplicate.add(elem);
			}
		}
       System.out.println("Original List "+original);
       System.out.println("After Removing Duplicate "+ duplicate);
	}

}
