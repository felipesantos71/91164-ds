public class PessoaJuridicaa extends PessoaJuFi {
    private String cnpj;
    private String inscricaoEstadual;

    // Construtor vazio
    public PessoaJuridicaa() {
        super();
    }

    // Construtor com parâmetros
    public PessoaJuridicaa(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Métodos getter
    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    // Métodos setter
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Método toString
    @Override
    public String toString() {
        return "\nPessoa Juridica" +
                "Nome: " + nome +
                "Telefone: " + telefone +
                "CPNJ: " + cnpj +
                "Inscrição Estadual: " + inscricaoEstadual;
    }
}
