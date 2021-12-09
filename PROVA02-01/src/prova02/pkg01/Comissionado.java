package prova02.pkg01;


public class Comissionado extends Empregado {
   private double vendasMensal;
   private double percComissao;
   
   public Comissionado(String Nome,String Sobrenome,String CPF,String  DataDeNascimento, double vendasMensal, double percComissao){
       super.Empregado(Nome, Sobrenome, CPF, DataDeNascimento);
       
       if(vendasMensal < 0.0 )
            throw new IllegalArgumentException("As vendas mensal deve ser maior ou igual a zero");
       this.vendasMensal = vendasMensal;
       this.percComissao = percComissao;
       
   }

    public double getVendasMensal() {
        return vendasMensal;
    }

    public void setVendasMensal(double vendasMensal) {
        if(vendasMensal < 0.0 )
            throw new IllegalArgumentException("As vendas mensal deve ser maior ou igual a zero");
        this.vendasMensal = vendasMensal;
    }

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }
    
    @Override
    public double getValorPagto() {
        return getVendasMensal() * getPercComissao();
    }
    
    @Override
    public String toString(){
        return "\nComissionado" + super.toString() +
                "\nPercentual da Comissão:" + getPercComissao() +
                "\nvendas mensal:" + getVendasMensal();
    }
}
