package EstruturasDeDados;

import java.util.Scanner;

public class Parenteses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strParenteses = sc.nextLine();
        System.out.println(confereParenteses(strParenteses));
    }
    public static String confereParenteses (String strParenteses){
        int qtdParenteses = 0;
        int i= 0;

        while (i < strParenteses.length()) {
            String paren = Character.toString(strParenteses.charAt(i));
            if (paren.equals("(")) {
                qtdParenteses += 1;
            } else if (paren.equals(")")) {
                qtdParenteses -= 1;
            }
            if (qtdParenteses < 0) {
                break;
            }
            i++;
        }
        if (qtdParenteses == 0) {
            return "S";
        }
        return "N";
    }
}

