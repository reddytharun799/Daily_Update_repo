package realtimeExampleRestaurant;

import java.time.LocalDate;

public class Order {

    private MenuItem item;
    private LocalDate date;

    public Order(MenuItem item, LocalDate date) {
        this.item = item;
        this.date = date;
    }

    public MenuItem getItem() {
        return item;
    }

    public LocalDate getDate() {
        return date;
    }


}
