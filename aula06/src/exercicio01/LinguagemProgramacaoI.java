package exercicio01;

import javax.swing.JOptionPane;

public class LinguagemProgramacaoI extends Disciplina implements Pratica {
    private String laboratorio;
    
    public LinguagemProgramacaoI() {
        System.out.println("Objeto Linguagem de Programação I criado!");           
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    
    public String obeterLaboratorio() {
        return this.laboratorio;
    }
    
    @Override
    public float calculaMedia(){
        String entrada;
        float nota1, nota2;
        
        entrada = JOptionPane.showInputDialog("Digite nota 1:");
        nota1 = Float.parseFloat(entrada);
        
        entrada = JOptionPane.showInputDialog("Digite nota 2:");
        nota2 = Float.parseFloat(entrada);
        
        return (nota1 + nota2 ) / 2;
    }

    @Override
    public String obterLaboratorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
