package codingPractice;

public class firstNonRepeatingOccuranceString {
	
	static char []count= new char[256];
	static void getcount(String str){
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)]++;
			// gets the count of each char in string
		}
	}
	static int firstoccurance(String str){
		getcount(str);
		int index=-1;
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]==1){
				index=i;
				break;				
			}
		}		
		return index;		
		
	}

	public static void main(String[] args) {
		
		String str= "geeksforgeeks";
		int index=firstoccurance(str);
        System.out.println(index==-1?"string is empty or all char are repeating"
        	:"first non repeeating char is "+ str.charAt(index)	
        		);
	}

}
