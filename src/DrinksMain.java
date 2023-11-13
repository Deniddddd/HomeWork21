import java.util.Arrays;
import java.util.Scanner;

public class DrinksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        Drinks drinks = new Drinks();
        boolean a = true;
        while (a) {
            System.out.println("Выберите напиток: ");
            System.out.println(Arrays.toString(DrinksMachine.values()));
            String choice = sc.nextLine();
            choice = choice.toUpperCase();
            DrinksMachine drinksAuto = DrinksMachine.valueOf(choice);
            switch (drinksAuto) {
                case COFFEE:
                    drinks.coffeePrepare();
                    break;
                case TEA:
                    drinks.teaPrepare();
                    break;
                case LEMONADE:
                    drinks.lemPrepare();
                    break;
                case MOJITO:
                    drinks.mojitoPrepare();
                    break;
                case SODA:
                    drinks.sodaPrepare();
                    break;
                case COCA_COLA:
                    drinks.colaPrepare();
                    break;

            }
            System.out.println("Желаете чего-нибудь еще? yes/no");
            boolean moreDrinks = true;
            while (moreDrinks) {
                String answer = sc.nextLine();
                if (answer.equals("no")) {
                    moreDrinks = false;
                    a = false;
                    System.out.println();
                } else if (answer.equals("yes")) {
                    moreDrinks = false;
                } else {
                    System.out.println("Ответьте - yes/no");
                }
            }
        }
    }
}
