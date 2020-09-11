public class CountedItem extends PurchaseItem {
    private final int quantity;

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
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
        return getQuantity() * getPrice();
    }

    @Override
    public String toString() {
        return "name : "+getName() + " @ "+"\nunit price : " + getPrice() + "\nquantity : " + quantity + " units" + "\nprice: " + calculate() + " $";
    }
}