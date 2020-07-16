import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a disciplina que deseja calcular a média: ");
        String disciplina = scan.next();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite o peso da primeira nota");
        double peso1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite o peso da segunda nota");
        double peso2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite o peso da terceira nota");
        double peso3 = scan.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("Sua média ponderada da disciplina %s é: %.2f", disciplina, media );

    }
}
