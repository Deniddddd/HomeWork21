package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DrinksMachine {
    private double totalCost = 0.0;

    private List<Drink> drinks = new ArrayList<>();

    public void start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите название напитка либо нажмите Enter для выполнения заказа : " + Arrays.toString(Drink.values()));

        while (true) {
            String userInput = scanner.nextLine().trim().toUpperCase();
            if (userInput.isEmpty()) break;
            try {
                Drink drink = Drink.valueOf(userInput);
                this.drinks.add(drink);
                this.totalCost += drink.getCost();
            } catch (java.lang.IllegalArgumentException e) {
                System.out.println("Вы ввели некорректное название напитка. попробуйте еще раз.");
            }
        }
    }

    public void process() {
        for (Drink drink : drinks) {
            System.out.println("Возьмите Ваш " + drink.getTitle());
            System.out.println("Стоимость: " + drink.getCost());
        }
        System.out.println("Колличество напитков: " + this.drinks.size());
        System.out.println("Общая стоимость : " + this.totalCost);
    }

    public double getTotalCost() {
        return totalCost;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

}
