package interface1;

public class MainInterface {
    public static void main(String[] args) {
        Gato1 gato = new Gato1();
        Galo1 galo = new Galo1();
        Pato1 pato = new Pato1();
        Cachorro1 cachorro = new Cachorro1();

        System.out.println("\nSom e alimentação dos animais");
        System.out.println("\nSom do gato : " + gato.emitirSom() + "\nGato come:  " + gato.comer());
        System.out.println("\nSom do pato: " + pato.emitirSom() + "\nPato come:  " + pato.comer());
        System.out.println("\nSom do cachorro: " + cachorro.emitirSom() + "\nCachorro come: " + cachorro.comer());
        System.out.println("\nSom do galo: " + galo.emitirSom() + "\nGalo come: " + galo.comer());
    }
}
