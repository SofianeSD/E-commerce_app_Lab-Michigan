public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            System.out.println("QuantityObserver: Order ID " + order.getId() + " - More than 5 items. Free shipping applied.");
        } else {
            System.out.println("QuantityObserver: Order ID " + order.getId() + " - Less than 5 items. Standard shipping cost applies.");
        }
    }
}
