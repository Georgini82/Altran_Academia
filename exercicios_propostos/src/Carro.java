public class Carro {

    String cor;
    String modelo;
    double velociadeAtual;
    double velociadeMaxima;
    Motor motor;

    // liga o carro
    void liga(){
        System.out.println("O carro está ligado");
    }

    // acelera uma certa quantidade
    void acelera(double quantidade){
        double velociadeNova = this.velociadeAtual + quantidade;
        this.velociadeAtual = velociadeNova;
    }

    // devolve a marcha do carro
    int pegaMarcha(){
        if (this.velociadeAtual < 0) {
            return -1;
        }
        if (this.velociadeAtual >= 0 && this.velociadeAtual < 40) {
            return 1;
        }
        if (this.velociadeAtual >= 40 && this.velociadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}

class Motor {
    int potencia;
    String tipo;
}

class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velociadeAtual = 0;
        meuCarro.velociadeMaxima = 80;

        // liga o carro
        meuCarro.liga();

        // acelera o carro
        meuCarro.acelera(20);
        System.out.println(meuCarro.velociadeAtual);
    }
}