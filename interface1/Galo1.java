package interface1;

public class Galo1 implements Animal{
//construtor vazio
    public Galo1(){
    } 

    @Override
    public String emitirSom(){
        return "cocoricó";
    }

    @Override
    public String comer(){
        return "milho";
    }

}
