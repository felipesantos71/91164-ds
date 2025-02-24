public class MainEnums {
    public static void main(String[] args) {
        Clientes clienteEnum = new Clientes("Maria", 42, Sexo.FEMININO);

        System.out.println(clienteEnum.toString());
    }
}
