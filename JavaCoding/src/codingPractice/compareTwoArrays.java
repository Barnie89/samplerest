package codingPractice;

import java.util.HashSet;

public class compareTwoArrays {	
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]={4,6,7,8,9};
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
			      if(arr1[i]==arr2[j]){
			    	  hs.add(arr1[i]);
			      }
			}
		}
		
		System.out.println("compared value "+hs);
	}
}
