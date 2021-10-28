package exerxicioslide4;

public class TrianguloRetangulo extends Triangulo implements  Retangulo {
    private double catetoAdj;
    private double catetoOpo;
    
    public TrianguloRetangulo(int numeroLados, double base, double altura ) {
        super(numeroLados, base, altura);
    }
    
    public void setCatetos(double catetoAdj, double catetoOpo) {
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }
    
    @Override
    public double clacularHipotenusa(){
        return Math.hypot(this.catetoAdj, this.catetoOpo);
    }
}
