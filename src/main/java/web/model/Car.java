package web.model;

public class Car {
    private String mark;
    private int year;

    private String color;

    public Car() {
    }

    public Car(String mark, int year, String color) {
        this.mark = mark;
        this.year = year;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
