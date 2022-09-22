public class Rectangulo extends Figuras {
    private double largo;
    private double ancho;
    public Rectangulo(double largo,double ancho){
        super();
        this.largo=largo;
        this.ancho=ancho;
    }
    public double area(){
        return largo*ancho;
    }
    public String getNombre(){
        return "rectángulo";
    }
}
