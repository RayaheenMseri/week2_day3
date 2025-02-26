class OrderManager {

    public void processOrder(Order order) {
        System.out.println("\nProcessing order: " + order.getOrderId());

            try {
                Thread.sleep(2000);
                order.setOrderStatus(OrderStatus.SHIPPED);
                System.out.println("Order " + order.getOrderId() + " status updated to SHIPPED.");

                Thread.sleep(3000);
                order.setOrderStatus(OrderStatus.DELIVERED);
                System.out.println("Order " + order.getOrderId() + " status updated to DELIVERED.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}