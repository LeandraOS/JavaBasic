package Algoritmos;

import java.util.Scanner;

class TeoremaMestre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int ord = Integer.parseInt(input[2]);

        double logA = Math.log10(a);
        double logB = Math.log10(b);

        double logAeB = logA / logB;

        String output = "T(n) = theta(";

        if (ord == logAeB) {
            output += "n**" + ord + " * log n)";
        }
        else if (ord < logAeB) {
            output += "n**" + logAeB + ")";

        } else {
            output += "n**" + ord + ")";
        }
        System.out.println(output);
    }
}