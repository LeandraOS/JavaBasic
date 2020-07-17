import java.util.Scanner;

public class ConversaoIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = scan.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeMeses= idade * 12;
        int idadeSemanas = idade * 52;
        int idadeDias = idade * 365;

        System.out.printf("A sua idade em:\nAnos é: %d\nMeses é: %d\nSemanas é: %d\nDias é: %d", idade, idadeMeses, idadeSemanas, idadeDias);

    }
}
