package aula07;

public class Empregado {
    
    //Atributo de classe
    private static int proxCod = 1;
    private static final String empresa = "Fatec Campinas";
    
    
    //atributos de instância.
    private int codigo;
    private String nome;
    private String departamento;
    private Float salario;
    
    public Empregado(String nome, String departamento){
        this.codigo = proxCod++;
        this.nome = nome;
        this.departamento = departamento;
    }

  
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void mostrarEmpregado() {
        System.out.println(empresa +
                "[" + this.getCodigo() + "]" +
                this.getNome() + " - (" + this.getDepartamento() + ") - RS" +
                this.getSalario() + "\n---------------");
    }

    public static void mostrarClasseEmpregado(Empregado emp) {
        System.out.println(empresa +
                "[" + emp.getCodigo() + "]" +
                emp.getNome() + " - (" + emp.getDepartamento() + ") - RS" +
                emp.getSalario() + "\n---------------");
    }
    
    public static void mostraEmpresa() {
        System.out.println("----" + empresa + "----");
    }

}
