package codingPractice;

public class allMissingNumberinArray {

	public static void main(String[] args) {
		
     int arr[]={12,14,15,17,20,25};
     int n= arr.length;
     int count=0;
     for(int i=arr[0];i<=arr[n-1];i++){
    	 if(arr[count]==i){
    		 count++;
    	 }else{
    		 System.out.println("Missing Number is "+i);
    	 }
     }
}
}
