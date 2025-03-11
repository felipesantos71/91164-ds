package interface1;

public class Gato1 implements Animal {
// Construtor vazio
    public Gato1() {
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public String comer() {
        return "Peixe";
    }
}
