package operacao_matematica;

public class Divisao1 implements Operador_interface {
//construtor vazio
    public Divisao1() {
    }

    @Override
    public double calcular(double a, double b) {
        return a / b;
    }

}
