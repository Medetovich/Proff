package lesson3.enums;

public enum Fruits {
    APPLE(52),
    PEAR(55),
    BANANA(89),
    GRAPES(45),
    APRICOT(33);


    private int calories;

    Fruits(int calories){
        this.calories = calories;
    }
    public int getCalories(){
        return calories;
    }
}
