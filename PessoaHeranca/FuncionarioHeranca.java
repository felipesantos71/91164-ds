public class FuncionarioHeranca extends Pessoa {
    private String matricula;
    private String cargo;
    private double salario;

    public FuncionarioHeranca() {
    }

    public FuncionarioHeranca(String nome, int idade, String matricula, String cargo, double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nIdade: " + idade 
        +"\nMatricula: " + matricula + "\nCargo: " + cargo
         + "\nSalario: " + salario;
    }
}
