public abstract class Figuras implements Comparable <Figuras> {
    public abstract double area();
    public int compareTo(Figuras figura){
        return Double.compare(this.area(),figura.area());
    }
}
