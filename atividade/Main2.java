public class Main2 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jose", 25,
        new Endereco("Rua M", "N 8","Salvador"));

        System.out.println(cliente1.toString());
    }
}
