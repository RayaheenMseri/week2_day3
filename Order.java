import java.util.UUID;
enum OrderStatus {
    PENDING, SHIPPED, DELIVERED
}

class Order {
    private UUID orderId;
    private String customerName;
    private UUID productId;
    private int quantity;
    private OrderStatus orderStatus;

    //constructor
    public Order(String customerName, UUID productId, int quantity) {
        this.orderId = UUID.randomUUID();
        this.customerName = customerName;
        this.productId = productId;
        this.quantity = quantity;
        this.orderStatus = OrderStatus.PENDING;
    }

    //getter
    public UUID getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public UUID getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    //setter
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setProductId(UUID productId) {
        this.productId = productId;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}