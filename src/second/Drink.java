package second;

public enum Drink {
    COFFEE("Кофе", DrinkCost.COFFEE),
    TEA("Чай", DrinkCost.TEA),
    LEMONADE("Лимонад", DrinkCost.LEMONADE),
    MOJITO("Мохито", DrinkCost.MOJITO),
    MINERAL("Минералка", DrinkCost.MINERAL),
    COLA("Кока-кола", DrinkCost.COLA);

    private final String title;
    private final double cost;

    private Drink(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

}

