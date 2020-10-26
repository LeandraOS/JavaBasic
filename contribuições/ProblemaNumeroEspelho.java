import java.util.Scanner;

/**
  * Faça um programa que recebendo um número inteiro positivo N em hexadecimal seja
  * capaz de verificar se este número em decimal é lido exatamente da mesma forma seja de
  * frente para trás ou de trás para frente.
  * Caso positivo o programa deverá retornar uma linha com o caractere S, caso contrário o
  * caractere informado deverá ser o N.
  *
  * https://adonaimedrado.pro.br/documentos/53_Problemas_de_Programacao.pdf
*/

public class ProblemaNumeroEspelho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String numHexa = sc.nextLine();
        Integer numInt = Integer.parseInt(numHexa, 16);
        
        String result = "S";
        String[] aux = numInt.toString().split("");
        for (int i = 0; i <= (aux.length/2) -1; i++) {
            if (!aux[i].equals(aux[(aux.length-i) -1])) {
                result = "N";
                break;
            }
        } System.out.println(result);

        sc.close();
    }

}
