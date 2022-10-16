package codingPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class firstRepeatingCharacter {
	
	static char repeatchar(char ch[]){
		
		int n = ch.length;
		Set<Character> sh= new HashSet<Character>();
		for(int i=0;i<n-1;i++){
			char temp= ch[i];
			if(sh.contains(temp)){
				return temp;
			}else{
				sh.add(temp);
			}
		}
		return 0;
	}
	

	public static void main(String[] args) {
		
	String c="Muthus";
	char[] ch= c.toCharArray();
	char ch1= repeatchar(ch);
	System.out.println("Repeated CHar "+ch1);
		
	}
}
