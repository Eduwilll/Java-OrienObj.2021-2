package aula10;

import javax.swing.JOptionPane;

public class Aula10 {

    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog("Digite numero 1: ");
            int n1 = Integer.parseInt(aux1.toString());

            String aux2 = JOptionPane.showInputDialog("Digite numero 2: ");
            int n2 = Integer.parseInt(aux2.toString()); 
        } catch ( NumberFormatException e){
            JOptionPane.showMessageDialog(null, "erro de conversão!" +
                        e.toString(),"erro",JOptionPane.ERROR_MESSAGE);
        } catch ( NullPointerException e){
            JOptionPane.showMessageDialog(null, "Nenhum valor digitado! " +
                        e.toString(),"erro",JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Tudo ok");
        }
    }
}
