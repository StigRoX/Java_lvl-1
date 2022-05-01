package core.directory;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void info() {
        System.out.println("Current food amount is " + foodCount);
    }

    public void decreaseFood(int amount) {
        foodCount -= amount;
        if (foodCount < 0) { foodCount = 0; }
        // foodCount = foodCount - amount
    }

    public void addFood(int amount) {
        foodCount += amount;
    }
}
