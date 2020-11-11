package EstruturasDeDados;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class WordCloud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int seqConsultas = texto.split(" ").length;
        HashSet hashSet = new HashSet(seqConsultas * 2);


        for (int i = 0; i < seqConsultas; i++ ){
            hashSet.put(texto.split(" ")[i]);
        }

        String palavraProcurada = sc.nextLine();

        while(!palavraProcurada.contains("fim")){
            System.out.println(hashSet.getFrequencia(palavraProcurada));
            palavraProcurada = sc.nextLine();
        }
    }

    public static class HashSet {

        private Palavra[] array;
        private int tamanho;

        public HashSet(int tamanho) {
            this.tamanho = tamanho;
            this.array = new Palavra[tamanho];
        }

        public int hash(int palavra, int probe) {
            return (Math.abs(palavra + probe) % tamanho);
        }

        public boolean contains(String palavra) {
            int i = 0;
            boolean encontrado = false;
            while (i < tamanho && !encontrado) {
                int chave = this.hash(palavra.hashCode(), i);
                if (this.array[chave] == null) {
                    i++;
                } else if (this.array[chave].equals(new Palavra(palavra))) {
                    encontrado = true;
                }
                i++;
            }

            return encontrado;
        }

        public int getFrequencia(String palavra) {
            int totalFrequencia = 0;
            if (contains(palavra)) {
                int i = 0;
                boolean encontrado = false;

                while (i < this.tamanho && !encontrado) {
                    int chave = this.hash(palavra.hashCode(), i);
                    if (this.array[chave] == null) {
                        i++;
                    } else if (this.array[chave].equals(new Palavra(palavra))) {
                        totalFrequencia = this.array[chave].getQuantidade();
                        encontrado = true;
                    }
                    i++;
                }
            }

            return totalFrequencia;
        }

        private void put(String palavra) {
            if (this.contains(palavra)) {
                int i = 0;
                boolean encontrado = false;

                while (i < this.tamanho && !encontrado) {
                    int chave = this.hash(palavra.hashCode(), i);
                    if (this.array[chave] == null) {
                        i++;
                    } else if (this.array[chave].equals(new Palavra(palavra))) {
                        this.array[chave].add();
                        encontrado = true;
                    }

                    i++;
                }
            } else {
                int i = 0;
                boolean encontrado = false;

                while (i < this.tamanho && !encontrado) {
                    int chave = this.hash(palavra.hashCode(), i);
                    if (this.array[chave] == null) {
                        this.array[chave] = new Palavra(palavra);
                        encontrado = true;
                    }
                    i++;
                }
            }

        }

        public String toString(){
            return Arrays.toString(this.array);
        }
    }

    static class Palavra {
        private String palavra;
        private int quantidade;

        public Palavra(String palavra) {
            this.palavra = palavra;
            this.quantidade = 1;
        }

        public void add() {
            this.quantidade++;
        }
        public int getQuantidade() {
            return this.quantidade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Palavra palavra1 = (Palavra) o;
            return palavra.equals(palavra1.palavra);
        }

        @Override
        public int hashCode() {
            return Objects.hash(palavra);
        }
    }
}

