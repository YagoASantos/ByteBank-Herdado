import classes.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Yago Aguiar");
        g1.setSalario(5000);
        g1.setSenha(123);
        System.out.println(g1.getNome());
        System.out.println(g1.getBonificacao());
        System.out.println(g1.autentica(123));
    }
}
