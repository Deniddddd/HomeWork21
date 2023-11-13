public enum DrinksMachine {
    COFFEE(50),
    TEA(50),
    LEMONADE(50),
    MOJITO(50),
    MINERAL(50),
    COLA(50);
    private int title;

    DrinksMachine(int price) {
        this.title = price;
    }

    public int getPrice() {
        return title;
    }
}
