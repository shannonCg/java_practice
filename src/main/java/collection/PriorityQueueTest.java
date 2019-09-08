package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	static class PQDiverseSort implements Comparator<Integer>{

		@Override
		public int compare(Integer arg0, Integer arg1) {
			return arg1-arg0;
		}
		
	}
	
	public static void main(String[] args){
		int[] a = {1, 5, 3, 7, 6, 9, 8};
		
		PriorityQueue<Integer> qu1 = new PriorityQueue<>();
		for(int x: a){
			qu1.offer(x);
		}
		while(qu1.size() > 0){
			System.out.print(qu1.poll()+", ");
		}
		System.out.println();
		
		PQDiverseSort qDiv = new PQDiverseSort();
		PriorityQueue<Integer> qu2 = new PriorityQueue<>(10, qDiv);
		for(int x: a){
			qu2.offer(x);
		}
		System.out.println("size "+qu2.size());
		System.out.println("peek "+qu2.peek());
		System.out.println("size "+qu2.size());
		System.out.println("poll "+qu2.poll());
		System.out.println("size "+qu2.size());
		for(int x: a){
			System.out.print(qu2.poll()+", ");
		}
	}
}
