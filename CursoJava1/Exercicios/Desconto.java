import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        System.out.println("Qual o preço do produto que você quer calcular o desconto ? ");

        Scanner scan = new Scanner(System.in);

        double precoBruto = scan.nextDouble();
        double valorDesconto = precoBruto * 0.1;
        double precoDesconto = precoBruto - valorDesconto;
        System.out.printf("O preço do produto sem desconto é de R$%.2f.\nO valor do desconto é de R$%.2f. \nO valor à pagar é R$%.2f. ", precoBruto, valorDesconto, precoDesconto);
    }
}
