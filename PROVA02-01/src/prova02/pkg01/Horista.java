package prova02.pkg01;


public class Horista extends Empregado {
    private double valorHora;
    private double horasTrab;
    
    public Horista(String Nome,String Sobrenome, String CPF,String  DataDeNascimento, double valorHora,double horasTrab){
        super.Empregado(Nome, Sobrenome, CPF,DataDeNascimento);
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }
    
    

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }
    
    @Override
    public double getValorPagto(){
    
        if(getHorasTrab() <= 160){
            return getHorasTrab() * getValorHora(); 
        } else {
            return getHorasTrab() * (getValorHora()* 1.5);
        }
    }
    
    @Override
    public String toString(){
        return "\nHorista " +super.toString() +
                "\nHoras Tabalhada: " + getHorasTrab() + "\nGanho por Hora: " + getValorHora();
    }
    
}
