package Entidades;

public class Individuo extends Contribuinte {
    private Double gastoComSaude;

    public Individuo() {
        super();
    }

    public Individuo(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public Double imposto() {
        double impostoBasico;
        if (getRendaAnual() < 20000.0) {
            impostoBasico = getRendaAnual() * 0.15;
        } else {
            impostoBasico = getRendaAnual() * 0.25;
        }
        
        if (gastoComSaude > 0.0) {
            impostoBasico -= (gastoComSaude * 0.5);
        }
        
        return impostoBasico < 0.0 ? 0.0 : impostoBasico;
    }

    @Override
    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", imposto());
    }
}