package lesson3;

public abstract class FigureAbstract {
    private String material;

    abstract  double getArea();
    abstract double getPerimeter();

    public FigureAbstract(){
        material = "Aluminium";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

   /* public double calcPrice(){

    }*/
}
