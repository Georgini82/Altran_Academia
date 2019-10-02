public class Teste {
    public static void main(String[] args) {
        ContaCliente minhaConta = new ContaCliente();
        Cliente c = new Cliente();
        minhaConta.titular = c;

        // Cliente clienteDaMinhaConta = minhaConta.titular;
        // clienteDaMinhaConta.nome = "Duke";
        minhaConta.titular.nome = "Duke";
        System.out.println(minhaConta.titular.nome);
    }
}

class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}

class ContaCliente{
    int numero;
    double saldo;
    Cliente titular;
}