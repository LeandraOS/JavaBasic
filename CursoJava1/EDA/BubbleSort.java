import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{
    public static int[] bubbleSort(int [] array){
        for (int i= 0; i < array.length; i++){
            for (int j= i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] entrada = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(bubbleSort(entrada)));
    }
}