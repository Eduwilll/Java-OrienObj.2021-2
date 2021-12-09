package prova02.pkg01;


public class BaseComissionado extends Comissionado {
    private double salarioBase;
    
    public BaseComissionado(String Nome,String Sobrenome,String CPF,String  DataDeNascimento, double vendasMensal, double percComissao, double salarioBase){
       super(Nome, Sobrenome, CPF,DataDeNascimento,vendasMensal,percComissao);
       if(salarioBase < 0.0 )
            throw new IllegalArgumentException("O salario base deve ser maior ou igual a zero");
       this.salarioBase = salarioBase;
   }



    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase < 0.0 )
            throw new IllegalArgumentException("O salario base deve ser maior ou igual a zero");
        this.salarioBase = salarioBase;
    }
    @Override
    public double getValorPagto() {
        return super.getValorPagto()+ getSalarioBase();
    }
    
    @Override
    public String toString(){
        return super.toString() +
                " \nbase salarial:" + getSalarioBase();
    }
    
}
