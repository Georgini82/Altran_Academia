public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataAbertura;

    void saca(double valor) {
        if (saldo - valor >= 0)
            saldo -= valor;
    }
    void deposita(double valor){ saldo += valor; }

    double calculaRendimento(){
        return 0.1*saldo;
    }

    String recuperarDadosParaImpressao(){
        String dados;
        dados = "\nNúmero: "           + numero +
                "\nTitular: "          + titular +
                "\nAgência: "          + agencia +
                "\nSaldo Atual: "      + saldo +
                "\nRendimentos: "      + calculaRendimento() +
                "\nData de Abertura: " + dataAbertura.toStringData();

        return dados;
    }
}

class Data{
    int dia;
    int mes;
    int ano;

    String toStringData(){
        return dia + "/" + mes + "/" + ano;
    }
}

class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;

        Data data = new Data();
        c1.dataAbertura = data;
        c1.dataAbertura.dia = 4;
        c1.dataAbertura.mes = 6;
        c1.dataAbertura.ano = 2015;

        c1.deposita(100.0);
        System.out.println("Saldo Atual: " + c1.saldo);
        System.out.println("Rendimento Mensal: " + c1.calculaRendimento());

        System.out.println(c1.recuperarDadosParaImpressao());

    }
}