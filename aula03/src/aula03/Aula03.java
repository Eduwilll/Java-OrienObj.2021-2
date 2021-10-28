package aula03;

public class Aula03 {

    public static void main(String[] args) {
        TV tv01= new TV("Sony", "XPTO", 50);
        TV tv02= new TV("Sansung", "XYZ", 55);
        TV tv03= new TV("LG");
        
        tv01.mostrarTV();        
        tv01.ligarTV();
        tv01.aumentarVolume();
        tv01.mostrarTV();
        
        tv02.ligarTV();
        tv02.trocarCanal(3);
        tv02.mostrarTV();
        
        tv03.ligarTV();
        tv03.trocarCanal(5);
        tv03.mostrarTV();
        
    }
    
}
