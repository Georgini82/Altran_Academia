public class Reitor extends EmpregadoDaFaculdade{
    // informações extra...

    @Override
    public String getInfo(){
        return super.getInfo() + " e ele é Reitor";
    }

    // não se sobrescreve o getGastos
}
