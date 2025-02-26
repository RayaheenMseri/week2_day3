public class StockPredictor {
    //Attribute
    private int dailySales;
    private Product product;


    //constructor
    public StockPredictor(Product product, int dailySales) {
        this.product = product;
        this.dailySales = dailySales;
    }

    //getter
    public int getDailySales() {
        return dailySales;
    }

    public Product getProduct() {
        return product;
    }

    //setter
    public void setDailySales(int dailySales) {
        this.dailySales = dailySales;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public int PredictsStock() {
        if (dailySales <= 0) {
            throw new IllegalArgumentException("Daily sales must be greater than zero.");
        }
        return product.getStockLevel() / dailySales;
    }

    public String suggestRestockStrategy() {
        int daysUntilStockOut = PredictsStock();
        if (daysUntilStockOut <= 3) {
            return "Urgent: Restock immediately.";
        } else if (daysUntilStockOut <= 7) {
            return "Moderate: Consider restocking soon.";
        } else {
            return "Stock is sufficient for now. Monitor closely.";
        }
    }

    public void display() {
        System.out.println("\nStock Prediction for " + product.getName() + '\n' + "Days until stock out:" + PredictsStock() + '\n' + "Restock Suggestion: " + suggestRestockStrategy());

    }
}