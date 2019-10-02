public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;

    public double getGastos(){
        return this.salario;
    }

    public String getInfo(){
        return "nome: " + this.nome + " com salario " + this.salario;
    }

    // metodos de get, set e outros
}
