package ss7_abstract_interface.exercise.interface_of_resizeble;

public class Square extends Shape {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public Square(){

    };

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea(){
        return edge * edge;
    }

    public double getPerimeter(){
        return edge * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                "color" + super.getColor()+
                '}';
    }
    public void resize(double edge){
        double tmp = edge * edge / 100;
        edge += tmp;
    }
}
