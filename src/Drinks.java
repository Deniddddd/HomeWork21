import java.util.Arrays;
import java.util.Scanner;

public class Drinks {
//    public static final int COFFEE_Price= 35;
//    public static final int TEA_Price= 20;
//    public static final int LEMONADE_Price=25;
//    public static final int MOJITO_Price=30;
//    public static final int MINERAL_Price=15;
//    public static final int COCA_COLA_Price=21;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = "";
        String stop;
        int cups = 0;
        int totalCups = 0;
        int totalPrice = 0;
        System.out.println("Please choose your drink");
        System.out.println(Arrays.toString(Drinks.values()));
        do {
            cups = scanner.nextInt();
            Drinks drinks = Drinks.valueOf(scanner.next().toUpperCase());

            totalCups += cups;
            totalPrice += cups * drinks.getPrice();
            order += String.format("%d cup(s) of %s for %d = %d%n", cups, drinks, drinks.getPrice(), cups * drinks.getPrice());

            System.out.println("Anything else ? - Yes/No");
            stop = scanner.next();
        } while ("Yes".equalsIgnoreCase(stop));

        System.out.println("Preparing your order - " + totalCups + " cups:");
        System.out.println(order);
        System.out.println("Total price: " + totalPrice);
    }
}