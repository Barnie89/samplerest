package codingPractice;

public class regexString {

	public static void main(String[] args) {
		String c= "abc1234";
		String x = c.replaceAll("[a-z]","");
		System.out.println("REmoved ALphabets "+x);
		
		// using string array or char array
		String v[]= x.split("");		
		//char ch[]=x.toCharArray();
		int n = v.length;
		// to print alternate char two approaches one by index Modulus
		 //or by incrementing i value in loop		
//		for(int i=0;i<n;i++){
//			if(i%2==0){
//				System.out.println(v[i]);
//			}
//		}		
		for(int i=0;i<n;i+=2){			
				System.out.println(v[i]);
			
		}

	}

}
