package aula04;

public class Aula04 {

    public static void main(String[] args) {
        /*Pessoa
            Pessoa Fisica
                Aluno
                Visitante
                Convidado
            Pessoa Juridica*/
        
        PessoaFisica pf = new PessoaFisica("Maria");
        System.out.println(pf.getNome());
        
        pf.setEndereco(("Rua X numero 0"));
        System.out.println(pf.getEndereco());
        
        pf.setCpf("010.203.040-50");
        System.out.println(pf.getCpf());
     
        PessoaFisica pf02 = new PessoaFisica("Carlos", "111.111.111-11");
        System.out.println(pf02.getNome() + pf02.getCpf());
        
        Aluno a1 = new Aluno("Jessica", "555.555.555-55",85465489);
        a1.mostrar();
        
        Visitante v1 = new Visitante("Pedro","777.777.777-77");
        v1.mostrar();
    }
    
}
