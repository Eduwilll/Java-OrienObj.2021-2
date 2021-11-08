
package aula9;

public class Aula9 {

    public static void main(String[] args) {
        System.out.println("Dado");
        Dado d = new Dado();
        d.setAposta(6);
        d.jogaJogo();
        d.mostraRsultado();
        System.out.println("Roleta");
        Roleta r = new Roleta();
        r.setAposta(21);
        r.jogaJogo();
        r.mostraRsultado();
    }
    
}
