package operacao_matematica;

public class Subtracao1 implements Operador_interface {
//construtor vazio
    public Subtracao1() {
    }

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
