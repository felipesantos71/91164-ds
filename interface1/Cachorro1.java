package interface1;

public class Cachorro1 implements Animal{
// Construtor vazio
    public Cachorro1() {
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String comer() {
        return "Racao";
    }
    
}
