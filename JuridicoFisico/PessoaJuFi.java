public abstract class PessoaJuFi {
    protected String nome;
    protected String telefone;

    // construtor vazio
    public PessoaJuFi() {
    }

    // construtor padrão
    public PessoaJuFi(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // métodos getter
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    // métodos setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome + "Telefone: '" + telefone;
    }
}
