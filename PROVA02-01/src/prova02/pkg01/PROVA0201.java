package prova02.pkg01;

public class PROVA0201 {

    public static void main(String[] args) {
       Assalariado as = new Assalariado("Samuel","alves","6548789","20/11/2020",1500);
            System.out.println(as.toString());
            
        Comissionado co= new Comissionado("Comissionado","Alguem","65465","20/11/2020",300,50);
              System.out.println(co.toString());

       BaseComissionado em= new BaseComissionado("Eduardo","Fabirico","46465","20/10/2020",100,1,100);
            System.out.println(em.toString());
       
        Horista ho = new Horista("Ronaldo","bilha", "5897", "20/11/2020",15,30);
            System.out.println(ho.toString());
            
        
        Pagavel[] pg = new Pagavel[4];
        pg[0] = new Fatura("1","Teste",10,500.00);
        pg[1] = new Assalariado("John", "Smith", "111-11-1111","10/12/2000",20.00);
        pg[2] = new Comissionado("Eduardo","Fabrico","54687","25/02/2001",500.00,.10);
        pg[3] = new Horista("Ronaldo", "Bilha", "111-11-1111","03/05/2020", 80.00,60);

        System.out.println("*******");
        
        for (Pagavel Empregado : pg){
            
            if (Empregado instanceof BaseComissionado) {
                
                BaseComissionado employee = (BaseComissionado) Empregado;
                employee.setSalarioBase(1.10 * employee.getSalarioBase());
                System.out.printf("Nova base do salário com 10% de inscremento é:" + employee.getSalarioBase());
            }
            

           
            System.out.println("\n\n"+Empregado.toString() + "\npagamento: "  +  Empregado.getValorPagto());
        }
        
        for (int j = 0; j < pg.length; j++)
            System.out.printf("Funcionários %d é um %s\n", j, pg[j].getClass().getName());
        }
       
}
    
