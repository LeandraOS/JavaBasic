
package sorting.linearSorting;

import sorting.AbstractSorting;

import java.util.Arrays;


public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		if (validate(array, leftIndex, rightIndex)) {
			Integer maxValue = findMax(array, leftIndex, rightIndex);
			sort(array, leftIndex, rightIndex, maxValue);
		}
	}

	private void sort(Integer[] array, int leftIndex, int rightIndex, Integer max) {
		int maxNumber = max + 1;

		Integer[] arrayIndexes = new Integer[maxNumber];
		Arrays.fill(arrayIndexes, 0);

		Integer[] arrayOrdered = new Integer[rightIndex - leftIndex + 1];
		Arrays.fill(arrayOrdered, 0);

		for (int i = leftIndex; i <= rightIndex; i++) {
			arrayIndexes[array[i]]++;
		}

		for (int j = 0; j < arrayIndexes.length - 1; j++) {
			arrayIndexes[j + 1] += arrayIndexes[j];
		}

		for (int k = rightIndex; k >= leftIndex; k--) {
			arrayOrdered[--arrayIndexes[array[k]]] = array[k];
		}

		for (int l = 0; l < arrayOrdered.length; l++) {
			array[l + leftIndex] = arrayOrdered[l];
		}
	}

	private Integer findMax(Integer[] array, int leftIndex, int rightIndex) {
		Integer max = array[leftIndex];

		for (int i = leftIndex; i <= rightIndex; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	private boolean validate(Integer[] array, int leftIndex, int rightIndex) {
		return (array != null && leftIndex >= 0 && rightIndex <= array.length - 1
				&& array.length > 1);
	}
}
