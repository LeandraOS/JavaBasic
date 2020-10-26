import java.util.Scanner;

/**
 * Faça um programa capaz de solicitar um número inteiro N (1<N<1000) do usuário
 * e ler N números inteiros. Ao final da leitura do último número, o programa
 * deverá informar, com uma casa decimal, a média aritmética entre os N números
 * que estejam contidos no intervalo fechado entre -1000 e 1000. Assuma que
 * todos os números fornecidos pelo usuário serão inteiros válidos e que a soma
 * de todos os N nunca será superior a um número inteiro de 32 bits.
 * 
 * https://adonaimedrado.pro.br/documentos/53_Problemas_de_Programacao.pdf
 */
public class ProblemaMedia {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        if (range > 1 && range < 1000) {
            
            float soma = 0;
            float totalNum = 0;
            for (int i = 0; i < range; i++) {
                
                float num = sc.nextFloat();
                if (num >= -1000 && num <= 1000) {
                    soma += num;
                    totalNum++;
                }
            }
            System.out.printf("%.1f", soma/totalNum);

        } else {
            System.out.println("N inválido.");
        }
        
        sc.close();
    }

}
