package aula03;

public class TV {
    //Atributos
    private String marca;
    private String modelo;
    private int polegadas;
    
    private boolean ligada;
    private int volume;
    private int canal;
    
    //Métodos
    public TV(String marca,String modelo, int polegadas){ //método construtor
        this.marca = marca;
        this.modelo = modelo;
        this.polegadas= polegadas;
        
        this.init_att();
    }
    
    public TV(String marca){
        this.marca = marca;
        this.modelo = "genérico";
        this.polegadas= 0;
        
        this.init_att();
    }
    
    private void init_att() {
        this.ligada = false;
        this.volume = 10;
        this.canal = 2;
    }
    
    public void ligarTV() {
        this.ligada = true;
    }
    
    public void desligarTV() {
        this.ligada = false;
    }
    
    public void trocarCanal(int canal) {
        this.canal = canal;
    }
    
    public void aumentarVolume() {
        this.volume++;
    }
    
    public void diminuirVolume() {
        this.volume--;
    }
    
    public void mostrarTV(){
        
        if(this.ligada) {
            System.out.println("\n" + marca + "--" + modelo +
                    "(" + polegadas + ")" +
                    "\nTV ligada!" +
                    "\nVolume = " + volume +
                    "\nCanal = " + canal);
        } else {
            System.out.println("\nTV desligada!");
        }
    }
    
}
