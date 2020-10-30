package Algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] entrada = converteArray(sc.nextLine());
		int maior = Integer.parseInt(sc.nextLine());
		int menor = Integer.parseInt(sc.nextLine());
		Counting(entrada, menor, maior);
	}
	
	public static void Counting(int[] array, int menor, int maior) {
		int k = maior - menor;
		int[] cont = new int[k + 1];
		
		Arrays.fill(cont, 0);
		
		for(int i = 0; i < array.length; i++) {
			cont[array[i] - menor] ++;
			System.out.println(Arrays.toString(cont));
		}
		
		for(int i = 1; i < cont.length; i++) {
			cont[i] += cont[i - 1];
		}
		
		System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(cont));
		
		int[] copiaArray = new int[array.length];
		
		for(int i = array.length - 1; i >= 0; i--) {
			cont[array[i] - menor]--;
			int index = cont[array[i] - menor];
			copiaArray[index] = array[i];
		}
		
		System.out.println(Arrays.toString(cont));
				
		copiaArray(array, copiaArray);
		System.out.println(Arrays.toString(array));
		}
	
	public static int[] converteArray(String array) {
		String[] listaAbs = array.split(" ");
		int[] listaOfc = new int[listaAbs.length];
		for (int k = 0; k < listaAbs.length; k ++) {
			listaOfc[k] = Integer.parseInt(listaAbs[k]);
		}return listaOfc;
	}
	
	public static void copiaArray(int[] original, int[] ordenado) {
		for(int i = 0; i < ordenado.length; i++) {
			original[i] = ordenado[i];
		}
	}
}