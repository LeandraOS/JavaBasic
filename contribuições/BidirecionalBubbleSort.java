package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (validate(array, leftIndex, rightIndex)) {
			for (int i = leftIndex; i < rightIndex + 1; i++) {

				for (int j = leftIndex; j < rightIndex; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						Util.swap(array, j, j + 1);
					}
				}

				for (int k = rightIndex; k > leftIndex; k--) {
					if (array[k - 1].compareTo(array[k]) > 0) {
						Util.swap(array, k, k-1);
					}
				}
			}
		}
	}

	private boolean validate(T[] array, int leftIndex, int rightIndex) {
		return (array != null && leftIndex >= 0 && rightIndex <= array.length - 1
				&& array.length > 1);
	}
}
