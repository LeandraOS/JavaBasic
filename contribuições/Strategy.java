public class Strategy {

    public static void main(String[] args){
        
        Formatacao formatacao;

        System.out.println("\nFormatação sendo mudada em tempo de execução: \n");

        formatacao = new Negrito();
        System.out.println(formatacao.aplicaFormatacao("Negrito!"));

        formatacao = new Italico();
        System.out.println(formatacao.aplicaFormatacao("Italico!"));

        formatacao = new CaixaAlta();
        System.out.println(formatacao.aplicaFormatacao("caixa alta!"));

        formatacao = new CaixaBaixa();
        System.out.println(formatacao.aplicaFormatacao("caixa baixa!"));

    }
}
