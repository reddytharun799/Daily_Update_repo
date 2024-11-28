package realtimeExampleRestaurant;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.awt.SystemColor.menu;

public class Restaurant {
    private String name;
    private List<MenuItem> menuItems;
    private List<Order> orders;

    public Restaurant(String name, List<MenuItem> menuItems){
        this.menuItems=menuItems;
        this.name=name;
        this.orders=new ArrayList<>();


    }

    public void addOrder(Order order) {
        orders.add(order);
    }


    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public List<Map.Entry<MenuItem, Long>> getMostSoldItems() {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getItem, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(1)
                .collect(Collectors.toList());
    }


    public DayOfWeek getMostPopularDay() {
        return orders.stream()
                .collect(Collectors.groupingBy(order -> order.getDate().getDayOfWeek(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }


}



