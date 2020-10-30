package Algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = converte(sc.nextLine());
        sort(array, 1);
    }

    private static int[] converte(String array) {
        String[] listaEntrada = array.split(" ");
        int[] listaInteiros = new int[listaEntrada.length];
        for (int i = 0; i < listaEntrada.length; i ++) {
            listaInteiros[i] = Integer.parseInt(listaEntrada[i]);
        }
        return listaInteiros;
    }

    public static void sort(int[] array, int indice) {
        if(indice < array.length) {
            insertionSort(array, indice);
            sort(array, indice + 1);
        }
    }

    public static void insertionSort(int[] array, int index) {
        int j = index;
        while(j > 0 && array[j - 1] > array[j]) {
            swap(array, j - 1 , j);
            j--;
        }

        System.out.println(Arrays.toString(array));

    }

    private static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}