public class ClienteHeranca extends Pessoa {
    private String dataDePagamento;
    private String formaDePagamento;

    public ClienteHeranca() {
    }


    public ClienteHeranca(String nome, int idade, String dataDePagamento, String formaDePagamento) {
        super(nome, idade);
        this.dataDePagamento = dataDePagamento;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nIdade: " + idade 
        + "\nData de Pagamento: " + dataDePagamento
         + "\nForma de Pagamento: " + formaDePagamento;
    }

}
