import java.util.UUID;

public class Product {
    //Attribute
    private UUID productId;
    private String name;
    private Double price;
    private int stockLevel;
    private int reorderThreshold;

    //constructor
    public Product(String name, Double price, int stockLevel, int reorderThreshold) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }

    //getter
    public UUID getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public int getStockLevel() {
        return stockLevel;
    }
    public int getReorderThreshold() {
        return reorderThreshold;
    }

    //setter
    public void setProductId(UUID productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
    public void setReorderThreshold(int reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }

    public void display(){
        System.out.println("\nProduct ID: " + productId + "\n" + "Name: "+ name + "\n" + "Price: " + price + "\n" + "Stock Level: " + stockLevel + "\n" + "Reorder Threshold: " + reorderThreshold);
    }

}
