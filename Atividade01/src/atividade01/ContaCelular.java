package atividade01;

public class ContaCelular extends ContaTelefone{
    
    public String operadora;
    
    public ContaCelular(int codigo, String numero, double minutosFalados,String operadora){
        super(codigo,numero,minutosFalados);
        this.operadora = operadora;
    }
    //IF NÂO FUNCIONA
    @Override
    public double getValorDaConta(){
        
      if("CPS".equals(this.operadora)){
          if(this.minutosFalados <= 20)
              return (this.minutosFalados * 0.9) + 40;
          else
              return (this.minutosFalados * 1.8) + 40;
      }else {
          if(this.minutosFalados <= 20)
              return (this.minutosFalados * 0.9);
          else
              return (this.minutosFalados * 1.8);
      }
    }
    
    @Override
    public String toString(){//overriding the toString() method  
        return "Codigo:"+this.codigo+" Numero:"+this.numero+" Minutos falados:"+this.minutosFalados+" Valor da conta:"+this.getValorDaConta()+ " operadora:"+ this.operadora;
    }  
    
}
