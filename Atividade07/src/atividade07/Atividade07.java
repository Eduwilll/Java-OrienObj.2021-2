package atividade07;

public class Atividade07 {

    public static void main(String[] args) {
       Deposito dep = new Deposito(); //falto o comando new para criar uma nova instância da class
       dep.colocar(5);
       dep.capacidade = 100;
       dep.colocar(60);
       dep.retirar();
    }
    
}
