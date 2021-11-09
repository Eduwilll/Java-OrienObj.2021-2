package aula11;

public class Produto<T> {
    private final T codigo;
    private String descricao;
    private double preco;
    
    public Produto(T cod, String descr, double pr) {
        codigo = cod;
        descricao = descr;
        preco = pr;
    }
    
    public T getCodigo() {return codigo;}
    public String getDescricao () {return descricao;}
    public double getPreco() {return preco;}
    
    @Override
    public String toString (){
        return "Produto{" + "codigo=" + codigo + ". descricao=" +
                descricao + ". preco=" + preco + "}";
    }
}
