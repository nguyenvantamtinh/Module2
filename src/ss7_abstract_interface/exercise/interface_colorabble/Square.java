package ss7_abstract_interface.exercise.interface_colorabble;

public class Square extends Shape implements Colorable{
    private double size;

    public Square(){
        size = 1;
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, double size) {
        super(color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return size* size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                "area=" + getArea()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println(" tô " + getColor() + " 4 cạnh ");
    }
}
