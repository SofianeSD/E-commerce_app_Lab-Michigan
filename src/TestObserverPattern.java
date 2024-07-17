public class TestObserverPattern {
    public static void main(String[] args) {
        Order order = new Order(1);
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(50);
        order.addItem(100);
        order.addItem(30);
        order.addItem(40);
        order.addItem(20);
        order.addItem(10);

        System.out.println("Final Order Total Cost: $" + order.getTotalCost());
        System.out.println("Final Item Count: " + order.getItemCount());
    }
}
