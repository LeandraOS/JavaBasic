package sorting.divideAndConquer;

import sorting.AbstractSorting;

import java.util.Arrays;


public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(validate(array, leftIndex, rightIndex)) {
			if (leftIndex < rightIndex) {
				int middle = (leftIndex + rightIndex) / 2;

				sort(array, leftIndex, middle);
				sort(array, middle + 1, rightIndex);

				merge(array, leftIndex, rightIndex);
			}
		}
	}

	private void merge(T[] array, int leftIndex, int rightIndex) {
		T[] arrayAux = Arrays.copyOf(array, array.length);

		int start = leftIndex;
		int middle = (leftIndex + rightIndex) / 2;
		int secStart = middle + 1;
		int count = leftIndex;

		while (start <= middle && secStart <= rightIndex) {
			if (arrayAux[start].compareTo(arrayAux[secStart]) <= 0) {
				array[count++] = arrayAux[start++];
			} else {
				array[count++] = arrayAux[secStart++];
			}
		}

		while (start <= middle) {
			array[count++] = arrayAux[start++];
		}

		while (secStart <= rightIndex) {
			array[count++] = arrayAux[secStart++];
		}
	}

	private boolean validate(T[] array, int leftIndex, int rightIndex) {
		return (array != null && leftIndex >= 0 && rightIndex <= array.length - 1
				&& array.length > 1);
	}
}
