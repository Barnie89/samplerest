package codingPractice;

public class maxArrayJava {

	public static void main(String[] args) {
		int arr[]={12,2,6,20};
		int max= arr[0];
        int n= arr.length;
        
        for(int i=0;i<n;i++){
        	if(arr[i]>max){
        		max= arr[i];
        	}
        
        }
         System.out.println("max value "+ max);
	}

}
