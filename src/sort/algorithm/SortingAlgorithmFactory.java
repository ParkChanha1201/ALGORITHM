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
			return BubbleSort.getInstance();
		case SELECTION:  
			return SelectionSort.getInstance(); 
		case QUICK:
			return QuickSort.getInstance();
		}
		return null;
	}
}
