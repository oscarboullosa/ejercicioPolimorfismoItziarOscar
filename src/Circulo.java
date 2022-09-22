public class Circulo extends Figuras {
    private double radio;
    public Circulo(double radio){
        super();
        this.radio=radio;
    }
    public double area(){
        return Math.pow(radio,2)*Math.PI;
    }
}
