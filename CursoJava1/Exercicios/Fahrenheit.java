import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura que deseja converter(em celsius, sem o ºc)");
        double celsius = scan.nextDouble();

        double fahrenheit = ((9 * celsius) / 5) + 32;
        System.out.printf("%.1f em celsius equivale a %.1f em Fahrenheit", celsius, fahrenheit);
    }
}
