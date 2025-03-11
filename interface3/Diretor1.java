package interface3;

public class Diretor1 extends FuncionarioInter implements Contratacao{
    private double PREMIO = 0.2;

// construtor vazio
    public Diretor1() {
    }

// construtor com parametros
    public Diretor1(String nome, String dataNascimento, Sexo1 sexo, Setor1 setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

// metodo para calcular salario final
    @Override
    public double salarioFinal() {
        return super.salarioFinal() + (super.salarioFinal() * PREMIO);
    }

// metodo para diretor contratar funcionarios
    @Override
    public void contratar(FuncionarioInter funcionario) {
        System.out.println("\nDiretor " + super.getNome() + " contratou o funcionario(a): " + funcionario.getNome());
    }

// metodo para diretor demitir funcionarios
    @Override
    public void demitir(FuncionarioInter funcionario) {
        System.out.println("\nDiretor " + super.getNome() + "Demitir o funcionario: " + funcionario.getNome());
    }

//toString
    @Override
    public String toString() {
        return "\n Diretor" + super.toString();
    }
}
