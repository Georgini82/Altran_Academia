public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    // metodos vêm aqui
    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract double getBonificacao();

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

