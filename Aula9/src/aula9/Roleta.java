package aula9;

import java.util.Random;

public class Roleta extends Jogo {
    @Override
    public void jogaJogo(){
        Random rnd = new Random();
        super.setResultado(rnd.nextInt(37));
    }
    @Override
    public void setAposta(int aposta) {
        if(aposta > 36 || aposta <0)
             System.out.println("Valor inválido para o Roleta");
        else
            super.setAposta(aposta);
    }
    
     @Override
    public void setResultado(int resultado) {
        System.out.println("Ops, não pode roubar na roleta!!");
    }
}
