public class Conta {
    int numero;
    String titular;
    double saldo;

    boolean saca(double quantidade){
        if (this.saldo < quantidade)
            return false;
        else {
            this.saldo -= quantidade;
            return true;
        }
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (!retirou)
            return false;
        else {
            destino.deposita(valor);
            return true;
        }
    }
}

class Programa {
    public static void main(String[] args) {
        // criar a conta
        Conta minhaConta;
        minhaConta = new Conta();

        // alterar os valores da minhaConta
        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000.0;
        System.out.println("Saldo atual: " + minhaConta.saldo);

        // saca 200 reais
        minhaConta.saca(200);
        System.out.println("Saldo atual: " + minhaConta.saldo);

        // deposita 500 reais
        minhaConta.deposita(500);
        System.out.println("Saldo atual: " + minhaConta.saldo);

        // visualizar o estado boolean do metodo saca
        boolean consegui = minhaConta.saca(1000);
        if (consegui)
            System.out.println("Consegui sacar!");
        else
            System.out.println("Não consegui sacar!");
        System.out.println("Saldo atual: " + minhaConta.saldo);

        // comparação entre contas
        Conta c1 = new Conta();
        c1.titular = "Duke";
        c1.saldo = 227;

        Conta c2 = new Conta();
        c2.titular = "Duke";
        c2.saldo = 227;

        if (c1.equals(c2)){
            System.out.println("Contas iguais");
        }

        System.out.println(c1.transferePara(c2,5000));
    }
}