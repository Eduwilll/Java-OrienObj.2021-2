package atividade07;

public class Deposito {
    
    public int itens = 0; //inserindo o valor inicial de itens
    public int capacidade = 10; //mudando para public para que possa ser acessado na main e falto declaro o tipo.
    
    public int retirar(){ //mudando o metodo para public para que possa ser acessado na main, adicionando parametro.
        if (itens > 0) {
            itens --;
            System.out.println("Caixa retirada: existem " + itens+" caixas");
        }
        return 0;
    }
    
    public int colocar(int itens) {//mudando o metodo para public para que possa ser acessado na main, adicionando parametro.
        if (itens <= capacidade) {
            this.itens += itens  ; //this para acessar os atributos da class
            System.out.println("Caixa armazenada: existem "+this.itens+" caixas");
        }
        return 0;
    }
    
}

