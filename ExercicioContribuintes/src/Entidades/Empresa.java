package Entidades;

public class Empresa extends Contribuinte {
    private Integer numeroDeFuncionarios;

    public Empresa() {
        super();
    }

    public Empresa(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        if (numeroDeFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }

    @Override
    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", imposto());
    }
}