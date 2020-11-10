package EstruturasDeDados;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HashSet {

    private Integer [] array;
    private int capacidade;
    private int quantElementos;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacidade = sc.nextInt();
        HashSet hash = new HashSet(capacidade);

        String[] entrada;

        do {
            entrada = sc.nextLine().split(" ");

            if (entrada[0].equals("put")) {
                System.out.println(hash.put(parseInt(entrada[1])));
            } else if (entrada[0].equals("remove")){
                System.out.println(hash.remove(parseInt(entrada[1])));
            }
            else if(entrada[0].equals("contains")) {
                System.out.println(hash.contains(parseInt(entrada[1])));
            }
        }
        while (!entrada[0].equals("end"));
    }

    public HashSet (int capacidade) {
        this.capacidade = capacidade;
        this.array = new Integer[capacidade];
        this.quantElementos = 0;

    }

    private int hash(int key, int probe) {
        return (key + probe) % this.capacidade ;
    }

    public String put (int valor) {
        int probe = 0;
        while (probe < this.capacidade) {
            if (contains(valor) || quantElementos == capacidade) {
                return this.toString();
            }
            int chave = hash(valor, probe);
            if (array[chave] == null) {
                array[chave] = valor;
                break;
            } else {
                probe++;
            }
        } quantElementos++;
        return toString();
    }
    public boolean contains(int valor) {
        int probe = 0;
        boolean encontrado = false;
        while (probe < capacidade && !encontrado) {
            int chave = hash(valor, probe);
            if (array[chave] != null && array[chave] == valor) {
                encontrado = true;
            }
            probe++;
        }
        return encontrado;
    }

    public String toString(){
        return Arrays.toString(this.array);
    }

    public String remove(int valor){
        int probe = 0;
        if (!contains(valor) || quantElementos == 0){
            return this.toString();
        }
        while (probe < capacidade){
            int chave = hash(valor, probe);
            if(array[chave] != null && array[chave] == valor){
                array[chave]= null;
            }
            else{
                probe++;
            }
        }quantElementos--;
        return toString();
    }
}
