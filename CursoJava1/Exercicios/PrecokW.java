import java.util.Scanner;

public class PrecokW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário mínimo: ");
        double salarioMinimo = scan.nextDouble();

        System.out.println("Digite a quantidade de quilowatts consumidas: ");
        double qtdQuilowatts = scan.nextDouble();

        double valorQuilowatt = salarioMinimo / 5;
        double valorPagar = qtdQuilowatts * valorQuilowatt;
        double desconto = valorPagar * 0.15;
        double valorPagarDesconto = valorPagar - desconto;

        System.out.printf("Valor do quilowatt R$%.2f\nValor a pagar: R$%.2f\nValor a pagar com desconto R$%.2f", valorQuilowatt, valorPagar, valorPagarDesconto);

    }
}
