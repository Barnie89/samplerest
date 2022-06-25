package codingPractice;

public class stringRepeat {

	public static void main(String[] args) {
		String input= "AAAADDDCCCCCC";
		StringBuilder res= new StringBuilder();		
		char peviouschar= input.charAt(0);
		int count=1;
		
		for(int i=1;i<input.length();i++){
			
			char currentchar= input.charAt(i);
			if(peviouschar!=currentchar){
				
				res.append(peviouschar).append(count).toString();
				peviouschar=currentchar;
				count=1;
			}else{
				count++;
			}	
			
		}	
		res.append(peviouschar).append(count).toString();
		System.out.println(res);
		
	}

}
