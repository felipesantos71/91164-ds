package operacao_matematica;

public class MainOperacao {
    public static void main(String[] args) {
        Soma1 soma = new Soma1();
        Subtracao1 subtracao = new Subtracao1();
        Multiplicacao1 multiplicacao = new Multiplicacao1();
        Divisao1 divisao = new Divisao1();

        System.out.println("\nOperações matemáticas");
        System.out.println("\nSoma: " + soma.calcular(10, 5));
        System.out.println("\nSubtração: " + subtracao.calcular(10, 5));
        System.out.println("\nMultiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("\nDivisão: " + divisao.calcular(10, 5));
    }
}
