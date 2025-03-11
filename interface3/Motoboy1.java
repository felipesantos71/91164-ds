package interface3;

public class Motoboy1 extends FuncionarioInter {
    private String carteiraDeHabilitacao;

//construtor vazio
    public Motoboy1() {
    }

//construtor com parametros
    public Motoboy1(String nome, String dataNascimento, Sexo1 sexo, Setor1 setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

//getters e setters
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

// toString
    @Override
    public String toString() {
        return "\n Motoboy" + super.toString() + 
        "\nCarteira de habilitacao: " + carteiraDeHabilitacao;
    }
}
