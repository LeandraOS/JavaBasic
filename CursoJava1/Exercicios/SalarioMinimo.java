import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas: ");
        double numHorasTrabalhadas = scan.nextDouble();

        System.out.println("Digite o valor do salário mínimo: ");
        double valorSalario = scan.nextDouble();

        double valorHoraTrabalhada = valorSalario * 0.1;
        double salarioBruto = numHorasTrabalhadas * valorHoraTrabalhada;
        double imposto = salarioBruto * 0.03;
        double salarioReceber = salarioBruto - imposto;

        System.out.printf("Valor da hora trabalhada: R$%.2f\nSalário bruto: R$%.2f\nValor do imposto: R$%.2f\nValor do salário: R$%.2f", valorHoraTrabalhada, salarioBruto, imposto, salarioReceber);
    }
}
