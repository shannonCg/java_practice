package kata;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Given an array, find the int that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */

public class FindOdd {

	public static int findIt(int[] a) {
	      Map<Integer, Long> numCounts = Arrays.stream(a)
	            .boxed()
	            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
	      
	      for(Integer key : numCounts.keySet()){
		    	  if(numCounts.get(key)%2 == 1){
		    		  return key;
		    	  }
		      }
	      
	  	  return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
		System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
		System.out.println(FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
		System.out.println(FindOdd.findIt(new int[]{10}));
		System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
		System.out.println(FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
	}

}
