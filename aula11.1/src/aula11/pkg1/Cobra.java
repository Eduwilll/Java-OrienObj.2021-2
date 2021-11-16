package aula11.pkg1;

public class Cobra extends Animal {
    
    @Override
    public void andar(){
        System.out.println("Eu rastejo como uma Cobra");
    }
    
    public void morder (){
        System.out.println("mordida de cobra!");
    }
}