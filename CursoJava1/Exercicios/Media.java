import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer calcular a média de qual disciplina? ");
        String disciplina = scan.next();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3)/ 3;
        System.out.printf("A sua média na disciplina %s é: %.1f", disciplina,media);
    }
}
