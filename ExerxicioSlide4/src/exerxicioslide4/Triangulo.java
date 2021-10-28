package exerxicioslide4;

public class Triangulo extends Poligono {
    private double altura;
    private double base;
    
    public Triangulo(int numeroLados, double base, double altura) {
        super(numeroLados);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return(this.base * this.altura) / 2;
    }
}
