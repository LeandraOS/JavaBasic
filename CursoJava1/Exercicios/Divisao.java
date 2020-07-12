import java.util.Scanner;

public class Divisao{
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numero2 = scan.nextInt();

        resultado = numero1/numero2;
        System.out.printf("A divisão inteira de %d por %d é igual a: %d", numero1, numero2, resultado );


    }
}