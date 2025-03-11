package interface3;

public abstract class FuncionarioInter {
    protected String nome;
    protected String dataNascimento;
    protected Sexo1 sexo;
    protected Setor1 setor;
    protected double salarioBase;

// construtor vazio
    public FuncionarioInter() {
    }

// salario final
    public double salarioFinal() {
        return salarioBase;
    }

// construtor com parametros
    public FuncionarioInter(String nome, String dataNascimento, Sexo1 sexo, Setor1 setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }
// get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo1 getSexo() {
        return sexo;
    }

    public void setSexo(Sexo1 sexo) {
        this.sexo = sexo;
    }

    public Setor1 getSetor() {
        return setor;
    }

    public void setSetor(Setor1 setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

// toString
    @Override
    public String toString() {
        return "\n Funcionario Empresa " + "\nNome: " + nome + 
        "\nData de nascimento: " + dataNascimento + 
        "\nSexo: " + sexo + 
        "\nSetor: " + setor + 
        "\nSalario base: " + salarioBase;
    }
}
