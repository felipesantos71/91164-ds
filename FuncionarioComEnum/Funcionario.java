public class Funcionario {
    private String id;
    private String nome;
    private double salario ;
    private int idade;
    private SetorFuncionario setorFuncionario;
    private SexoFuncionario sexoFuncionario;

    public Funcionario() {
    }

    public Funcionario(String id, String nome, double salario, int idade, SetorFuncionario setorFuncionario,
            SexoFuncionario sexoFuncionario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.setorFuncionario = setorFuncionario;
        this.sexoFuncionario = sexoFuncionario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public SetorFuncionario getSetorFuncionario() {
        return setorFuncionario;
    }

    public void setSetorFuncionario(SetorFuncionario setorFuncionario) {
        this.setorFuncionario = setorFuncionario;
    }

    public SexoFuncionario getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(SexoFuncionario sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNome: " + nome + "\nSalario: R$ " + salario
         + "\nIdade: " + idade + "\nSetor do Funcionario: " + setorFuncionario
         + "\nSexo: " + sexoFuncionario;
    }

}
