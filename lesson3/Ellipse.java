package lesson3;

public class Ellipse implements FigureInterface{
    private double exis1, exis2;

    public Ellipse(double exis1, double exis2) {
        this.exis1 = exis1;
        this.exis2 = exis2;
    }

    public double getExis1() {
        return exis1;
    }

    public void setExis1(double exis1) {
        this.exis1 = exis1;
    }

    public double getExis2() {
        return exis2;
    }

    public void setExis2(double exis2) {
        this.exis2 = exis2;
    }
    @Override
    public double getPerimeter(){
        return 4*(Math.PI * (exis1 + exis2) + (exis2 - exis1) * (exis2 - exis1)) /(exis2 + exis1);
    }
    @Override
    public double getArea(){
        return Math.PI *exis1 * exis2;
    }
}
