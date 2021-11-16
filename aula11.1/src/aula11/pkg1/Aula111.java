
package aula11.pkg1;

import java.util.List;
import java.util.LinkedList;

class Animal {
    public void andar() {
        System.out.println("Eu ando como uma animal genério!");
    }
}
public class Aula111 {

    public static void main(String[] args) {

       
        List<Animal> animais = new LinkedList<Animal>();
        
        animais.add(new Arara());
        animais.add(new Cobra());
        animais.add(new Urso());
        animais.add(new Animal());
        
        for (Animal a : animais){
            a.andar();
            //a.morder(); -> Animal não possui o metodo morder()
            if(a instanceof Cobra){
                //downcasting
                Cobra c = (Cobra) a;
                c.morder();
            }
            if(a instanceof Arara){
                //downcasting
                Arara ar = (Arara) a;
                ar.bica();
            }
            if(a instanceof Urso){
                //downcasting
                Urso as = (Urso) a;
                as.morder();
            }
       }
    }
}

