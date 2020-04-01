package sort.algorithm;

import java.util.List;

public class BubbleSort implements SortingAlgorithm{
	@Override
	public void printName() {
		System.out.println("BubbleSort");
	}
	
	@Override
	public void sort(List<Integer> list) {
		int length = list.size();
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - 1 - i ; j++) {
				if(list.get(j) > list.get(j + 1)) {
					int tmp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, tmp);
				}
			}
		}
	}

}
