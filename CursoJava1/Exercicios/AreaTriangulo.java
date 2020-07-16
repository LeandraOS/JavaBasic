import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = scan.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = scan.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("O valor da área é: %.1f", area);
    }
}
