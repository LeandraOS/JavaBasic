import java.util.Scanner;

public class Custos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do carro: ");
        double valorCarro = scan.nextDouble();

        System.out.println("Digite o percentual de lucro do distribuidor(sem o %): ");
        double percDistribuidor = scan.nextDouble();

        System.out.println("Digite o percentual de lucro de impostos: ");
        double percImpostos = scan.nextDouble();

        double lucroDistribuidor = valorCarro * (percDistribuidor/ 100);
        double valorImpostos = valorCarro * (percImpostos / 100);
        double valorTotal = valorCarro + lucroDistribuidor + percImpostos;

        System.out.printf("Valor bruto do carro: R$%.2f\nValor de lucro do distribuidor: R$%.2f\nValor de impostos: R$%.2f\nValor total do carro: R$%.2f", valorCarro,lucroDistribuidor, valorImpostos, valorTotal);

    }
}
