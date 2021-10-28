package exerxicioslide4;


public class ExerxicioSlide4 {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4, 7.4);
        System.out.println("Áera do quadrado = " +
                q1.calcularArea());
        
        Triangulo t1 = new Triangulo(3,10,4.8);
        System.out.println("Área do Triangulo = " +
                t1.calcularArea());
        
        TrianguloRetangulo tr1= new TrianguloRetangulo(3, 12, 5);
        tr1.setCatetos(12, 5);
        System.out.println("Área do triangulo retangulo = " +
                tr1.calcularArea() + 
                "\nHipotenusa = " +
                tr1.clacularHipotenusa());
    }
        

}
