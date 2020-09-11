public class WeighedItem extends PurchaseItem {
    private final double weigh;

    public WeighedItem(String name, double unitPrice, double weigh) {
        super(name, unitPrice);
        this.weigh = weigh;
    }

    public double getWeigh() {
        return weigh;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double calculate() {
        return getWeigh() * getPrice();
    }

    @Override
    public String toString() {
        return getName() + " @ "+"\nunit price : " + getPrice() + " \n weight : " + weigh + " kg" + "\n price : " + calculate() + " $";
    }
}
