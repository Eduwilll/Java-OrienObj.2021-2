package aula9;

abstract public class Jogo {
    private int aposta;
    private int resultado;
    
    public void setAposta(int aposta) {
        this.aposta = aposta;
    }
    
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    abstract public void jogaJogo();
    
    public void mostraRsultado(){
        System.out.println("Sua aposta foi " +
                this.aposta + " e o resultado foi " +
                this.resultado);
        
        if(this.resultado == this.aposta)
            System.out.println("Parabéns!!!");
        else
            System.out.println("Que pena, tente novamente...");
    }   
    
}
