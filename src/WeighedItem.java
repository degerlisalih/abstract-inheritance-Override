public class WeighedItem extends PurchaseItem {
    private final double w;

    public WeighedItem(String n, double up, double w) {
        super(n, up);
        this.w = w;
    }

    public double getW() {
        return w;
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
        return getW() * getPrice();
    }

    @Override
    public String toString() {
        return getName() + " @ "+"\nunit price : " + getPrice() + " \n weight : " + w + " kg" + "\n price : " + calculate() + " $";
    }
}
