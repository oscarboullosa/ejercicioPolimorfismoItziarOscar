public class Triangulo extends Figuras {
    private double base;
    private double altura;
    public Triangulo(double base,double altura){
        super();
        this.base=base;
        this.altura=altura;
    }
    public double area(){
        return base*altura/2;
    }
    public String getNombre(){
        return "triángulo";
    }
}
