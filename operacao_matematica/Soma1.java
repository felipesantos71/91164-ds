package operacao_matematica;

public class Soma1 implements Operador_interface {
//construtor vazio
    public Soma1() {
    }

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
