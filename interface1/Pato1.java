package interface1;

public class Pato1 implements Animal {
// Construtor vazio
    public Pato1() {
    }

    @Override
    public String emitirSom() {
        return "Quack";
    }

    @Override
    public String comer() {
        return "Migalhas";
    }
}
