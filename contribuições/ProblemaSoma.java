import java.util.Scanner;

/**
 * Faça um programa capaz de solicitar um número N (1<N<1000) do usuário e ler N
 * números inteiros. Após a leitura do último número deve-se informar: • Na
 * primeira linha a soma dos N números em decimal. • Na segunda linha a soma em
 * hexadecimal dos números pares informados. • Na terceira linha a soma em octal
 * dos números impares informados. Assuma que todos os números fornecidos pelo
 * usuário serão inteiros válidos e que as somas nunca serão superiores a um
 * número inteiro de 32 bits.
 * 
 * https://adonaimedrado.pro.br/documentos/53_Problemas_de_Programacao.pdf
*/

public class ProblemaSoma {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        if (range > 1 && range < 1000) {
           
            int somaTotal = 0;
            int somaPares = 0;
            int somaImpares = 0;
            for (int i = 0; i < range; i++) {
                
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    somaPares += num;
                } else if (num % 2 != 0) {
                    somaImpares += num;
                }
                somaTotal += num;
            }

            System.out.println(somaTotal);
            System.out.println(Integer.toHexString(somaPares));
            System.out.println(Integer.toOctalString(somaImpares));

        } else {
            System.out.println("N inválido.");
        }

        sc.close();
    }

}
