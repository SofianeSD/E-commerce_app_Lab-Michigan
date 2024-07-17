public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalCost() > 200) {
            double discountedPrice = order.getTotalCost() - 20;
            order.setTotalCost(discountedPrice);
            System.out.println("PriceObserver: Order ID " + order.getId() + " - Applied $20 discount. New total cost: $" + order.getTotalCost());
        }
    }
}
