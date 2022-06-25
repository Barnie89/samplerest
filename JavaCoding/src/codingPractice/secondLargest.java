package codingPractice;

public class secondLargest {

	public static void main(String[] args) {
		int arr[]={10,20,40,70};
		int FL,SL;
		if(arr[0]>arr[1]){
			FL=arr[0];
			SL=arr[1];
		}else{
			SL=arr[0];
			FL=arr[1];
		}
		
		for(int i=2;i<arr.length;i++){
			
			if(arr[i]>FL){
				
			SL=FL;
			FL=arr[i];
			}
			else if(arr[i]<FL&&arr[i]>SL){
				
			SL=arr[i];	
				
			}
			
		}
System.out.println("SecondLargest No :" +SL);
	}

}
