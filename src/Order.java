import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double totalCost;
    private int itemCount;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        // Constructor code
    }

    public void addItem(double price) {
        // Method code
    }

    public void attach(OrderObserver observer) {
        // Method code
    }

    public void detach(OrderObserver observer) {
        // Method code
    }

    private void notifyObservers() {
        // Method code
    }

    public int getId() {
        return id;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setTotalCost(double totalCost) {
        // Method code
    }
}
