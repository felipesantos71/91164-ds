public class PessoaFisicaa extends PessoaJuFi {
    private String cpf;
    private String rg;
    private String dataNascimento;

    // Construtor vazio
    public PessoaFisicaa() {
        super();
    }

    // Construtor com parâmetros
    public PessoaFisicaa(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Métodos getter
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Métodos setter
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método toString
    @Override
    public String toString() {
        return "\nPessoa Fisica" +
                "Nome: " + nome + 
                "Telefone: " + telefone +
                "CPF: " + cpf + 
                "RG: " + rg +
                "Data de Nascimento: " + dataNascimento;
    }
}
