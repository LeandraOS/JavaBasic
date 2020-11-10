package EstruturasDeDados;

import java.util.Scanner;

class FuraFila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int indice = Integer.parseInt(sc.nextLine());


        int[] array = converteArray(entrada);




        System.out.print(furaFila(array, indice));

        }

        public static String furaFila(int[] array, int indice) {
            int control = 0;
            String saida = "";
            for(int i = indice; i < array.length; i ++) {
                int aux = array[i];
                int indiceSecundario = i;
                while(indiceSecundario > control) {
                    array[indiceSecundario] = array[indiceSecundario - 1];
                    indiceSecundario --;
                }array[control] = aux;
                control ++;
                saida += retornaSaida(array) + "\n";
            }return saida;
        }



        private static String retornaSaida(int[] vetor) {
            String saida = "[";
            for (int i = 0; i < vetor.length; i++) {
                if(i == vetor.length - 1) {
                    saida += vetor[i] + "]";
                }else {
                    saida += vetor[i] + ", ";
                }
            }return saida;
        }


        public static int[] converteArray(String vetor) {
            String[] listaAbs = vetor.split(" ");
            int[] lista = new int[listaAbs.length];
            for (int k = 0; k < listaAbs.length; k ++) {
                lista[k] = Integer.parseInt(listaAbs[k]);
            }return lista;
        }


    }


