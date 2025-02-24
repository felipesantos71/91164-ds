public class MainHeranca1 {
    public static void main(String[] args) {
        ClienteHeranca clienteHeranca = new 
        ClienteHeranca("Fripomg", 26, "25/05/2024", "A vista");

        FuncionarioHeranca funcionarioHeranca = new
         FuncionarioHeranca("Cuadrado", 36, "lazaro", "Carregador de caixa", 2500.0);

        System.out.println(funcionarioHeranca.toString());
        System.out.println(clienteHeranca.toString());
    }
}
