package aula04;

public class Aluno extends PessoaFisica {
    
    private int ra;
    
    public Aluno(String nome) {
        super(nome);
    }
    
    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
    
    public Aluno(String nome, String cpf, int ra) {
        super(nome, cpf);
        this.ra = ra;
    }
    
    public Aluno(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RA: " + this.getRa());
    }
}
