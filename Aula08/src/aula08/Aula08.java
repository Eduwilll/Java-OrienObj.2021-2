package aula08;

public class Aula08 {

    public static void main(String[] args) {

        Bicicleta bici1= new Bicicleta();
        bici1.calibrarPneu();
        bici1.pedalar();
        
        Carro car1= new Carro();
        car1.calibrarPneu();
        car1.dirigir();
        
        Conversivel conv1 = new Conversivel();
        conv1.abrirCapota();
        conv1.dirigir();
        conv1.calibrarPneu();
        
    }
    
}
