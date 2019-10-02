public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
    private int horasDeAula;

    @Override
    public double getGastos(){
        return this.getGastos() + this.horasDeAula * 10;
    }

    @Override
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aulas: " + this.horasDeAula;

        return informacao;
    }

    // metodos de get, set e outros
}
