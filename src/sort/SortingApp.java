package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sort.algorithm.SortingAlgorithm;
import sort.algorithm.SortingAlgorithmFactory;

public class SortingApp {
	private static int LIST_SIZE = 30;
	private static int MAX_INTEGER = 70;
	
	public static void main(String[] args) {
		SortingAlgorithm algorithm;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select Number(1. bubble sort 2. selection sort)");
		
		int number;
		
		number = scanner.nextInt();
		
		scanner.close();
		
		algorithm = SortingAlgorithmFactory.getAlgorithm(number);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < LIST_SIZE; i++) {
			list.add((int)(Math.random() * MAX_INTEGER));
		}
		
		algorithm.printName();
		
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
