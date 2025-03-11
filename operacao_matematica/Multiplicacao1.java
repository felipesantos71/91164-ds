package operacao_matematica;

public class Multiplicacao1 implements Operador_interface {
//construtor vazio
    public Multiplicacao1() {
    }

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }

}
