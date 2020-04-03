package sort.algorithm;

import java.util.List;

public class QuickSort implements SortingAlgorithm{
	private static QuickSort instance;
	
	private QuickSort() {
	}
	
	public static QuickSort getInstance() {
		if(instance == null) {
			instance = new QuickSort();
			return instance;
		}
		return instance;
	}
	
	@Override
	public void sort(List<Integer> list) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void printName() {
		System.out.println("Quicksort(Unimplemented Algorithm)");
	}
}
