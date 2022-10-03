package codingPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersectionOfArrays {

	public static void main(String[] args) {
	
		Integer arr1[]={1,2,3,4,5};
		Integer arr2[]={4,6,7,8,9};
		
	HashSet<Integer> hs1 = new HashSet(Arrays.asList(arr1));
	HashSet<Integer> hs2 = new HashSet(Arrays.asList(arr2));
		hs1.retainAll(hs2);

		
		
		System.out.println("Intersected array "+hs1);
	}

}
