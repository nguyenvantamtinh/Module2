package ss7_abstract_interface.exercise.interface_colorabble;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red",4);
        shapes[1] = new Square("green",8);

        for (Shape e : shapes){
            if (e instanceof Square){
                Square square = (Square) e;
                System.out.println("area : " + square.getArea() );
                square.howToColor();
            }
        }
    }

}
