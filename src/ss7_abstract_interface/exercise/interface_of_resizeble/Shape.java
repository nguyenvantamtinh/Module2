package ss7_abstract_interface.exercise.interface_of_resizeble;

public abstract class Shape implements Resizeable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape(){
        this.color = "blue";

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
