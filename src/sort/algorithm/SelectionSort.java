package sort.algorithm;

import java.util.List;

public class SelectionSort implements SortingAlgorithm{
	@Override
	public void printName() {
		System.out.println("SelectionSort");
	}
	
	@Override
	public void sort(List<Integer> list) {
		int length = list.size();
		
		for(int i = 0; i < length; i++) {
			 int minValue = Integer.MAX_VALUE;
			 int minValueIndex = 0;
			 
			 for(int j = i + 1; j < length; j++) {
				 if(minValue > list.get(j)) {
					 minValue = list.get(j);
					 minValueIndex = j;
				 }
			 }
			 
			 if(minValue != Integer.MAX_VALUE) {
				 int temp = list.get(i);
				 list.set(i, list.get(minValueIndex));
				 list.set(minValueIndex, temp);
			 }
		}
	}
}
