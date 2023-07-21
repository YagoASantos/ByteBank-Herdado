import classes.Funcionario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Funcionario yago = new Funcionario();
        yago.setNome("Yago Aguiar");
        yago.setCpf("123123123");
        yago.setSalario(10000);
        System.out.println(yago.getNome());
        System.out.println(yago.getBonificacao());
    }
}