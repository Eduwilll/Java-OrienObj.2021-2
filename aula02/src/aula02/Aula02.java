
package aula02;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula02 {

    public static void main(String[] args) {
        float largura, comprimento, area , perimetro;
        String aux;
        
        /* //Entrada de dados com Scanner
        Scanner sc = new Scanner(System.in);
        
        try {;
   
        
            System.out.println("Digite a largura:");
            largura = sc.nextFloat();

            System.out.println("Digite o Comprimento");
            comprimento = sc.nextFloat();

            area = largura * comprimento;
            perimetro = largura * 2 + comprimento * 2;

            System.out.println("Area = "+ area);
            System.out.println("Perimetro = "+ perimetro);
        } catch (InputMismatchException e){
            System.out.println("Problemas com a entrada dos dados!");
        }*/
        
        //Entrada de dados com Jopion pane
        try {
            aux = JOptionPane.showInputDialog("Digite a Largura");
            largura = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a Comprimento");
            comprimento = Float.parseFloat(aux);

            area = largura * comprimento;
            perimetro = largura * 2 + comprimento * 2;

            JOptionPane.showInternalMessageDialog(null, "Área = " + area + 
                    "\nPrimetro = " + perimetro);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Problemas na entrada!");
        
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
    }
   
}
