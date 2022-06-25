package codingPractice;

public class missingElementinArray {
	
	public static int missingNo(int n[])
	{
		
		int m= n.length;
		int sum=((m+1)*(m+2))/2;
		for(int i=0;i<m;i++){
			sum=sum-n[i];
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		
		int arr[]={1,2,3,4,6};
		System.out.println(missingNo(arr));
		
	    
	    
		

	}

}
