import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Circulo circulo=new Circulo(5.7);
        Triangulo triangulo=new Triangulo(9.4,7.2);
        Rectangulo rectangulo =new Rectangulo(4.16,3.987);
        Cuadrado cuadrado=new Cuadrado(10.27);
        Figuras[] vector =new Figuras[4];
        vector[0]=circulo;
        vector[1]=triangulo;
        vector[2]=rectangulo;
        vector[3]=cuadrado;
        Arrays.sort(vector);
        for (int i=0;i<vector.length;i++) {
            System.out.println("Área : " + vector[i].area()+"\n");
        }
    }
}