public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario){
        System.out.println("Adicionando bonificação do funcionario: " + funcionario);
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
