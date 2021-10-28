package exercicio01;

public class Exercicio01 {

     public static void main(String[] args) {
         LinguagemProgramacaoI lp1 = new LinguagemProgramacaoI();
         
         lp1.setCodigo(452);
         lp1.setLaboratorio("Lab. 05");
     
         System.out.println("Nome: " + lp1.obeterLaboratorio());
         System.out.println("Média: " + lp1.calculaMedia());
     }
    
}
