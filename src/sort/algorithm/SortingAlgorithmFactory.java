package sort.algorithm;

import sort.SortType;

public class SortingAlgorithmFactory {
	private static SortType getSortType(int n){
		switch(n) {
		case 1:
			return SortType.BUBBLE;
		case 2:
			return SortType.SELECTION;
		}
		return null;
	}
	
	public static SortingAlgorithm getAlgorithm(int n){
		switch(getSortType(n)) {
		case BUBBLE:
			return new BubbleSort();
		case SELECTION:
			return new SelectionSort();
		}
		return null;
	}
}
