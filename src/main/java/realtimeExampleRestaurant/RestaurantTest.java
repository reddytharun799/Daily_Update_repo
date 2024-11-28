package realtimeExampleRestaurant;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


import java.util.function.Function;



public class RestaurantTest {
    public static void main(String[] args) {
        MenuItem Chicken_Majestic = new MenuItem("Chicken_Majestic", 365.99);
        MenuItem Keema_Samosa  = new MenuItem("Keema_Samosa ", 420.99);
        MenuItem Chilli_Prawns = new MenuItem("Chilli_Prawns", 320.99);
        MenuItem salad = new MenuItem("Salad", 250.99);

        List<MenuItem> menu = Arrays.asList(Chicken_Majestic, Keema_Samosa, Chilli_Prawns, salad);
        Restaurant restaurant = new Restaurant("Paradise", menu);


        restaurant.addOrder(new  Order(Chicken_Majestic, LocalDate.of(2024, 11, 21)));
        restaurant.addOrder(new Order(Keema_Samosa, LocalDate.of(2024, 11, 21)));
        restaurant.addOrder(new Order(Chilli_Prawns, LocalDate.of(2024, 11, 22)));
        restaurant.addOrder(new Order(Chilli_Prawns, LocalDate.of(2024, 11, 22)));
        restaurant.addOrder(new Order(Keema_Samosa, LocalDate.of(2024, 11, 23)));
        restaurant.addOrder(new Order(Keema_Samosa, LocalDate.of(2024, 11, 23)));
        restaurant.addOrder(new Order(Chicken_Majestic, LocalDate.of(2024, 11, 24)));
        restaurant.addOrder(new Order(salad, LocalDate.of(2024, 11, 24)));
        restaurant.addOrder(new Order(Keema_Samosa, LocalDate.of(2024, 11, 24)));




        System.out.println("Top Sold Items:");
        restaurant.getMostSoldItems().forEach(entry ->
                System.out.println(entry.getKey().getName() + " - Sold: "  + entry.getValue()));


        DayOfWeek mostPopularDay = restaurant.getMostPopularDay();
        System.out.println("Most Popular Day for Orders: " + mostPopularDay);
    }



    }

