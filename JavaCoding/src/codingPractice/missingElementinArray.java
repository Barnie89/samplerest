package codingPractice;

public class missingElementinArray {
	
		public static void main(String[] args) {
		
		
		int arr[]={1,2,3,5,6};
		int x =0;
		int n= arr.length;
		int total = ((n+1)*(n+2))/2;
		
		for(int i=0;i<n;i++)
				{
			x=x+arr[i];
				}
	
	    
	    int sum= total-x;
	    
	    System.out.println("Missing No "+sum);
		

	}

}
