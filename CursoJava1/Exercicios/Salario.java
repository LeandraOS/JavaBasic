
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário base: ");
        double salarioBase = scan.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioReceber = salarioBase + gratificacao - imposto;

        System.out.printf("\nValor da gratificação: R$%.2f \nValor do imposto: R$%.2f \nValor do salário a receber: R$%.2f \n", gratificacao, imposto, salarioReceber);
    }
}
