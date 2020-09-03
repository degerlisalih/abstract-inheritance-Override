public class CountedItem extends PurchaseItem {
    private final int q;

    public CountedItem(String n, double up, int q) {
        super(n, up);
        this.q = q;
    }

    public int getQ() {
        return q;
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
        return getQ() * getPrice();
    }

    @Override
    public String toString() {
        return "name : "+getName() + " @ "+"\nunit price : " + getPrice() + "\nquantity : " + q + " units" + "\nprice: " + calculate() + " $";
    }
}