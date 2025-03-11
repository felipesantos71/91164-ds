package interface3;

public class MainInterface3 {
    public static void main(String[] args) {
        Diretor1 diretor = new Diretor1("Joao", "02/12/1990", Sexo1.MASCULINO
        , Setor1.FINANCEIRO, 10000);
        Motoboy1 motoboy = new Motoboy1("Maria", "05/12/1990", Sexo1.FEMININO
        , Setor1.OPERACOES, 1000, "123456");
    
        System.out.println(diretor.toString());
        System.out.println("Salario final: " + diretor.salarioFinal());
        System.out.println(motoboy.toString());
        System.out.println("Salario final: " + motoboy.salarioFinal());

        diretor.contratar(motoboy);
    }
}

/**

 */