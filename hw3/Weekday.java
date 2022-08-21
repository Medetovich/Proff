package hw3;

public enum Weekday {
    MONDAY(false), TUESDAY(false), WEDNESDAY(false),
    THURSDAY(false), FRIDAY(false), SATURDAY(true),
    SUNDAY(true);
    boolean isFree;

    Weekday(boolean isFree){
        this.isFree = isFree;
    }

    public boolean isWeekday(){
        return !isFree;
    }

    public boolean isWeekend(){
        return isFree;
    }

    @Override
    public String toString() {
        return "Weekday{" +
                "isFree=" + isFree +
                '}';
    }
}
