package codingPractice;

public class stringOccurancePosition {

	public static void main(String[] args) {
		String x= "Muthus";
		char[] ch = x.toCharArray();
		int l=0;
        int k=0;
		int n= ch.length;
		
		for(int i =0; i<n;i++){
			{
				for(int j=i+1;j<n;j++){
					if(ch[i]==ch[j]){
						 l= i+1;
						 k= j+1;
						 System.out.println("repeat char "+ch[i]+ "is at position "+l+"and"+k);	}
				}
			}
			
				
		}
		
	}

}
