package realtimeExampleRestaurant;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


import java.util.function.Function;



public class RestaurantTest {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", 120.99);
        MenuItem burger = new MenuItem("Burger", 190.99);
        MenuItem pasta = new MenuItem("Pasta", 110.99);
        MenuItem salad = new MenuItem("Salad", 170.99);

        List<MenuItem> menu = Arrays.asList(pizza, burger, pasta, salad);
        Restaurant restaurant = new Restaurant("Gourmet Bites", menu);


        restaurant.addOrder(new  Order(pizza, LocalDate.of(2024, 11, 21)));  // Thursday
        restaurant.addOrder(new Order(burger, LocalDate.of(2024, 11, 21))); // Thursday
        restaurant.addOrder(new Order(pasta, LocalDate.of(2024, 11, 22)));  // Friday
        restaurant.addOrder(new Order(pasta, LocalDate.of(2024, 11, 22)));  // Friday
        restaurant.addOrder(new Order(burger, LocalDate.of(2024, 11, 23))); // Saturday
        restaurant.addOrder(new Order(burger, LocalDate.of(2024, 11, 23))); // Saturday
        restaurant.addOrder(new Order(pizza, LocalDate.of(2024, 11, 24)));  // Sunday
        restaurant.addOrder(new Order(salad, LocalDate.of(2024, 11, 24)));  // Sunday
        restaurant.addOrder(new Order(burger, LocalDate.of(2024, 11, 24))); // Sunday




        System.out.println("Top Sold Items:");
        restaurant.getMostSoldItems().forEach(entry ->
                System.out.println(entry.getKey().getName() + " - Sold: " + entry.getValue()));


        DayOfWeek mostPopularDay = restaurant.getMostPopularDay();
        System.out.println("Most Popular Day for Orders: " + mostPopularDay);
    }



    }

