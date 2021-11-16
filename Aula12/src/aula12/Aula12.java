package aula12;

public class Aula12 {
    public static void main(String[] args) {
        ContaCorrente cc  = new  ContaCorrente();
        cc.setSaldo(720);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(500);
        
        GeradorExtrato ge = new GeradorExtrato();
        ge.imprimeExtrado(cc,"Conta Corrente");
        ge.imprimeExtrado(cp,"Poupanca");
        
        
    }
    
}
