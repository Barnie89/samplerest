package codingPractice;

public class moveZerosEndArray {

	public static void main(String[] args) {
		
		int  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
	//Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
		
		int n= arr.length;
		int count=0;
		
		
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<n){
			arr[count]=0;
			count++;
			
		}
		for(int i=0;i<n;i++){
		System.out.println("Element moved" +arr[i]);
		}
		

	}

}
