package sort;

import java.util.ArrayList;
import java.util.List;

import sort.algorithm.BubbleSort;
import sort.algorithm.SortingAlgorithm;

public class SortingApp {
	private static int LIST_SIZE = 30;
	private static int MAX_INTEGER = 70;
	
	public static void main(String[] args) {
		SortingAlgorithm algorithm;
		algorithm = new BubbleSort();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < LIST_SIZE; i++) {
			list.add((int)(Math.random() * MAX_INTEGER));
		}
		
		System.out.println("정렬 전 :");

		printList(list);
		
		algorithm.sort(list);
		
		System.out.println("정렬 후 :");
		
		printList(list);
	}
	
	static void printList(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}
