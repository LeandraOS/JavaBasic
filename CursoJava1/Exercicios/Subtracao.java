import java.util.Scanner;

public class Subtracao{
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = scan.nextInt();

        resultado = numero1 - numero2;
        System.out.printf("O resultado da subtração de %d por %d é igual a: %d", numero1, numero2, resultado);

    }
}