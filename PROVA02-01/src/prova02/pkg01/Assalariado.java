package prova02.pkg01;


public class Assalariado extends Empregado {
    private double salarioMensal;
    

    public Assalariado (String Nome,String Sobrenome,String CPF,String  DataDeNascimento, double salarioMensal){
        super.Empregado(Nome, Sobrenome, CPF,  DataDeNascimento);
        
        if(salarioMensal < 0.0 )
            throw new IllegalArgumentException("O salario mensal deve ser maior ou igual a zero");
        
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0.0 )
            throw new IllegalArgumentException("O salario mensal deve ser maior ou igual a zero");
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double getValorPagto() {
        return getSalarioMensal();
    }
    
    @Override
    public String toString(){
        return "\nAssalariado "+ "Nome:"+ super.getNome() + " Sobrenome:" + super.getSobrenome() + " \nCPF: " + super.getCPF() +
                "\nsalario mensal:" + getSalarioMensal();
    }
    
}
