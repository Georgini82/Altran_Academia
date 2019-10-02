public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // podemos chamar metodos do funcionario
        gerente.setNome("João da Silva");

        // e tambem do Gerente
        gerente.setSenha(1234);

        System.out.println(gerente.autentica(1234));

        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());

        Gerente g = new Gerente();
        Funcionario f = g;
        f.setSalario(1000.0);
        System.out.println(g.getBonificacao());

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        //Funcionario funcionario2 = new Funcionario();
        //funcionario2.setSalario(1000.0);
        //controle.registra(funcionario2);

        System.out.println(controle.getTotalBonificacoes());


    }
}
