
package prova02.pkg01;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class Empregado implements Pagavel {
    
    private String Nome;
    private String Sobrenome;
    private String CPF;
    private LocalDate DataDeNascimento;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    
    public void Empregado(String Nome,String Sobrenome,String CPF,String DataDeNascimento){
        
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;        
        this.CPF = CPF;
        this.DataDeNascimento = LocalDate.parse(DataDeNascimento, formatter);
    }

   

    public String getDataDeNascimento() {
        return formatter.format(DataDeNascimento);
    }
    
    public void setDataDeNascimento(String dataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    @Override
    public String toString(){
        return " Nome:"+ getNome() + " Sobrenome:" + getSobrenome() + " CPF:" + getCPF() + " Data de nascimento:"+ getDataDeNascimento();
    }

    

    
    
}
