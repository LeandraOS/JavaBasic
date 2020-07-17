import java.util.Scanner;

public class Divisao{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scan.nextInt();

        int resultado = numero1/numero2;
        System.out.printf("A divisão inteira de %d por %d é igual a: %d", numero1, numero2, resultado );


    }
}