package prova02.pkg01;


public class Fatura implements Pagavel {
    
    private final String Numero;
    private final String Descricao;
    private int Quantidade;
    private double Preco;
    
    public Fatura(String Numero, String Descricao, int Quantidade, double Preco){
        
        if(Quantidade < 0)
            throw new IllegalArgumentException("Quantidade deve maior ou igual a zero");
        
        if(Preco < 0)
            throw new IllegalArgumentException("Preco deve ser maior ou igual a zero");
        
        this.Numero = Numero;
        this.Descricao = Descricao;
        this.Quantidade = Quantidade;
        this.Preco = Preco;
    }
    

    public String getNumero() {
        return Numero;
    }


    public String getDescricao() {
        return Descricao;
    }


    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        if(Quantidade < 0)
            throw new IllegalArgumentException("Quantidade deve maior ou igual a zero");
        this.Quantidade = Quantidade;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        if(Preco < 0)
            throw new IllegalArgumentException("Preco deve ser maior ou igual a zero");
        this.Preco = Preco;
    }

    @Override
    public double getValorPagto() { 
    return getQuantidade() * getPreco(); 
    } 
    
    @Override
    public String toString(){
        return "\nNumero: " + getNumero() + " \nDescricao: " + getDescricao() + 
                "\nquantidade: " + getQuantidade() + "\nPreço: " + getPreco();
    }
    
    
}
