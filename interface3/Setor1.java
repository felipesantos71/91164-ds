package interface3;

public enum Setor1 {
    RECURSOS_HUMANOS, FINANCEIRO, OPERACOES;

    //GET
    public String getSetor() {
        return this.name();
    }
}
