import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = lado * lado;
        System.out.printf("Área do quadrado: %.2f", area);
    }
}







