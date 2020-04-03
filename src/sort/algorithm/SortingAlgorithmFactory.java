package sort.algorithm;

import sort.SortType;

public class SortingAlgorithmFactory {
	private static SortType getSortType(int n){
		switch(n) {
		case 1:
			return SortType.BUBBLE;
		case 2:
			return SortType.SELECTION;
		case 3:
			return SortType.QUICK;
		}
		return null;
	}
	
	public static SortingAlgorithm getAlgorithm(int n){
		switch(getSortType(n)) {
		case BUBBLE:
			return new BubbleSort();
		case SELECTION:
			return new SelectionSort();
		case QUICK:
			return QuickSort.getInstance();
		}
		return null;
	}
}
