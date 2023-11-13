package second;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Здравствуйте! Сделайте свой заказ.");
            DrinksMachine drinksMachine = new DrinksMachine();
            drinksMachine.start();
            drinksMachine.process();
            System.out.println("До свидания!");
        }
    }
}
