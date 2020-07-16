import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual o valor do salário: ");
        double salario = scan.nextDouble();

        double comissao = salario * 0.04;
        double salarioTotal = salario + comissao;

        System.out.printf("Valor do salário bruto: R$%.2f\nValor da comissão: R$%.2f\nValor do salário bruto R$%.2f\n", salario, comissao, salarioTotal);

    }
}
