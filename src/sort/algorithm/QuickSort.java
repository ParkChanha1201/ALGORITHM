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
	
	private int partition(List<Integer>list, int left, int right) {
		//list.get(left) is pivot
		int pivot = list.get(left);
		//index for quick sort
		int i = left + 1;
		int j = right;
		
		while(i < j) {
			while(list.get(i) < pivot) {
				i++;
			}
			
			while(list.get(j) > pivot) {
				j--;
			}

			if(i < j) {
				int temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		
		list.set(left, list.get(j));
		list.set(j, pivot);
		
		return j;
	}
	
	private void quickSort(List<Integer>list, int left, int right){
		if(left < right) {
			int j = partition(list, left, right);
			quickSort(list, left, j-1);
			quickSort(list, j + 1, right);
		}
	}
	
	@Override
	public void sort(List<Integer> list) {
		int length = list.size();
		
		quickSort(list, 0, length - 1);
	}

	@Override
	public void printName() {
		System.out.println("Quicksort");
	}
}
