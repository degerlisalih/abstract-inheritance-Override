public abstract class PurchaseItem {
    private final String name;
    private double unitPrice;

    public PurchaseItem(String n, double up) {
        name = n;
        setPrice(up);
    }
    public abstract double calculate();

    public String getName() {
        return name;
    }

    public void setPrice(double up) {
        unitPrice = (up > 0) ? up : 0;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String toString() {
        return getName() + "@ " + getPrice();
    }

}
