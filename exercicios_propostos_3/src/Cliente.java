public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudaCPF(String cpf){
        if (this.idade <= 60){
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }

    public void validaCPF(String cpf){
        // codigo para testar CPF
    }
}

class Conta{
    Conta(){
        System.out.println("Construindo uma conta...");
    }

    private double saldo;
    // ...

    public double pegaSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }
}

class TestaAcessoComPegaSaldo {
    // int x = 37;
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(1000);
        System.out.println("Saldo: " + minhaConta.pegaSaldo());
        //System.out.println(x);
    }
}
