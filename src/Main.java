import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo(4.16,3.987);
        Figuras[] vector =new Figuras[4];
        vector[0] = new Circulo(5.7);
        vector[1] = new Triangulo(9.4,7.2);
        vector[2] = rectangulo;
        vector[3] = new Cuadrado(10.27);
        double sum = suma(vector);
        Arrays.sort(vector);
        System.out.println("La suma de todas las áreas es: " + sum +"\n");
        for (int i=0;i<vector.length;i++) {
            System.out.println("Área : " + vector[i].area()+"\n");
        }
    }
    public static double suma(Figuras [] vector){
        double suma = 0;
        int i = 0;
        while(i < vector.length){
            suma = suma + vector[i].area();
            i++;
        }
        return suma;
    }
}