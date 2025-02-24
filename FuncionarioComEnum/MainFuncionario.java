public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("52685987", "Loro",
         35000.0, 52, SetorFuncionario.MARKETING, SexoFuncionario.MASCULINO);

        System.out.println(funcionario1.toString());
    }
}
