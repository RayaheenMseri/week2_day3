import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter average daily sales for Laptop: ");
        int laptopD = scanner.nextInt();

        System.out.print("Enter average daily sales for Smartphone: ");
        int smartPhD = scanner.nextInt();
        scanner.close();

        Product product1 = new Product("Laptop",1200.0,20,5);
        product1.display();

        Product product2 = new Product("Smartphone",800.0,10,3);
        product2.display();


        StockPredictor stockPredictor1 = new StockPredictor(product1, laptopD);
        stockPredictor1.display();

        StockPredictor stockPredictor2 = new StockPredictor(product2, smartPhD);
        stockPredictor2.display();


        Order order1 = new Order("Rayaheen",product1.getProductId(),2);
        OrderManager orderManager = new OrderManager();
        orderManager.processOrder(order1);
    }
}