public abstract class PurchaseItem {
    private final String name;
    private double unitPrice;

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        setPrice(unitPrice);
    }
    public abstract double calculate();

    public String getName() {
        return name;
    }

    public void setPrice(double unitPrice) {
        this.unitPrice = (unitPrice > 0) ? unitPrice : 0;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String toString() {
        return getName() + "@ " + getPrice();
    }

}
