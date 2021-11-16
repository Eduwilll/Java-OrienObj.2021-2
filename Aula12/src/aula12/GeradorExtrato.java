package aula12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorExtrato {
    
    public void imprimeExtrado (Conta c, String tipo){
        Date agora = new Date() ;
        
        SimpleDateFormat formatoData =  new SimpleDateFormat("dd/MM/yyyy HH:mm;ss");
        
        System.out.println(formatoData.format(agora) +
                " Saldo: " + tipo+ ":" + c.getSaldo());
    }
    
    
    
    
}
