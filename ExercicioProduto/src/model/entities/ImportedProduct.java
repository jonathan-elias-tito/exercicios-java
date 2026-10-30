package model.entities;

public class ImportedProduct extends Product {
    private double customFee;

    public ImportedProduct() {}

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    public double tax() {
        return getPrice() + customFee;
    }

    @Override
    public String tag() {
        return getName() 
             + " $ " + String.format("%.2f", tax()) 
             + " (Customs fee: $ " + String.format("%.2f", customFee) + ")";
    }
}