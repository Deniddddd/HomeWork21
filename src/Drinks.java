import java.util.Arrays;
import java.util.Scanner;

public class Drinks {
    public static final int COFFEE_Price = 35;
    public static final int TEA_Price = 20;
    public static final int LEMONADE_Price = 25;
    public static final int MOJITO_Price = 30;
    public static final int MINERAL_Price = 15;
    public static final int COCA_COLA_Price = 21;
    Scanner sc = new Scanner(System.in);
    public int coffeePrepare() {
        System.out.println("Чашка кофе стоит: " + COFFEE_Price + "₴");
        System.out.print("Введите количество чашек кофе: ");
        return sc.nextInt();
    }

    public int teaPrepare() {
        System.out.println("Чашка чая стоит: " + TEA_Price + "₴");
        System.out.print("Введите количество чашек чая: ");
        return sc.nextInt();
    }
    public int lemPrepare() {
        System.out.println("ЛИМОНАД стоит: " + LEMONADE_Price + "₴");
        System.out.print("Введите количество лимонада : ");
        return sc.nextInt();
    }
    public int mojitoPrepare() {
        System.out.println("мохито  стоит: " + MOJITO_Price + "₴");
        System.out.print("Введите количество мохито: ");
        return sc.nextInt();
    }
    public int sodaPrepare() {
        System.out.println("сода  стоит: " + MINERAL_Price + "₴");
        System.out.print("Введите количество соды : ");
        return sc.nextInt();
    }
    public int colaPrepare() {
        System.out.println("кола стоит: " + COCA_COLA_Price + "₴");
        System.out.print("Введите количество колы: ");
        return sc.nextInt();
    }
}