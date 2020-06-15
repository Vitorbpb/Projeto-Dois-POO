package Entidades;

public class Operador extends Funcionario {
    private double valorHora;

    public Operador(Integer id, String nome, String email,String documento,double valorHora) {
        super(id,nome,email,documento);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}