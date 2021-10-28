package atividade01;

public class ContaTelefone {
    
    public int codigo;
    public String numero;
    public double minutosFalados;
    
    public ContaTelefone(int codigo, String numero, double minutosFalados ){
        this.numero = numero;
        this.codigo = codigo;
        this.minutosFalados = minutosFalados;
    }
    
    public double getValorDaConta(){
      if(minutosFalados <= 30){
        return  minutosFalados *= 0.6;
      } else {
          return  minutosFalados *= 0.4;
      }
    }

    @Override
    public String toString(){//overriding the toString() method  
        return "Codigo:"+this.codigo+" Numero:"+this.numero+" Minutos falados:"+this.minutosFalados+" Valor da conta:"+this.getValorDaConta();
    }  
    
}
