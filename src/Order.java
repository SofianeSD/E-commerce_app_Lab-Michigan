import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double totalCost;
    private int itemCount;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void addItem(double price) {
        this.totalCost += price;
        this.itemCount++;
        notifyObservers();
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
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
        this.totalCost = totalCost;
    }
}
