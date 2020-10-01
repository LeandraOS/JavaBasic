import java.util.Scanner;

public class BuscaBinariaRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] arrayStr = input.nextLine().split(" ");
        int [] arrayInt = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++){
            arrayInt[i] = Integer.parseInt(arrayStr[i]);
        }
        int element = input.nextInt();
        buscaBinariaRecursiva(arrayInt, element, 0, arrayInt.length - 1);

    }

    public static int buscaBinariaRecursiva(int[] array, int element, int left, int right) {

        if (right >= left && array.length != 0) {

            int mid = (left + right) / 2;

            if (array[mid] == element) {
                System.out.println(mid);
                return array[mid];

            } else if (array[mid] < element) {
                System.out.println(mid);
                return buscaBinariaRecursiva(array, element, mid + 1, right);

            } else if (array[mid] > element) {
                System.out.println(mid);
                return buscaBinariaRecursiva(array, element, left, mid - 1);
            }
        }
        System.out.println(-1);
        return -1;
    }
}
