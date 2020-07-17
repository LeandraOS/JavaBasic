import java.util.Scanner;

public class ConversaoMedidas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a medida em pés que você deseja converter: ");
        double pes = scan.nextDouble();

        double polegadas  = pes * 12;
        double jardas = pes / 3;
        double milhas  = jardas / 1760;

        System.out.printf("O valor %.2f em pés, convertido para:\nPolegadas é: %.2f\nJardas é: %.2f\nMilhas é: %.2f", pes, polegadas, jardas, milhas);


    }
}
