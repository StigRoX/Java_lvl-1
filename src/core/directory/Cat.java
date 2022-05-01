package core.directory;

public class Cat {
    private int appetite;

    private boolean satiety = false;
    private int volumeToDrink;
    private String name;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        int foodCount = plate.getFoodCount();
        if (foodCount >= appetite && !satiety) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println(name + " недостаточно еды в данной тарелке, чтобы наесться.");
        }
    }

    public void drink(Plate plate) {
        plate.decreaseFood(volumeToDrink);
    }

    public int getVolumeToDrink() {
        return volumeToDrink;
    }

    public void setVolumeToDrink(int volumeToDrink) {
        this.volumeToDrink = volumeToDrink;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName(){
        return name;
    }


}
