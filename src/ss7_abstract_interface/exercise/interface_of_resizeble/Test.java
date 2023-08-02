package ss7_abstract_interface.exercise.interface_of_resizeble;

public class Test {
    public static void main(String[] args) {
       Shape[] shapes = new Shape[3];
       shapes[0] = new Circle("BLUE",8);
       shapes[1] = new Square("black",4);
       shapes[2] = new Rectangle("red", 5,4);

       for (Shape e : shapes){
           if (e instanceof Circle){
               Circle circle = (Circle) e;

               System.out.println("kích thước area chuẩn : " + circle.getArea());
               circle.resize(4);
               System.out.println(" area sau khi tăng " + circle.getArea());
               System.out.println();
           }else if(e instanceof Square){
               Square square = (Square) e;
               System.out.println("kích thước square chuẩn : " + square.getArea());
               square.resize(4);
               System.out.println(" square sau khi tăng " + square.getArea());
               System.out.println();
           }else if(e instanceof Rectangle){
               Rectangle rectangle = (Rectangle) e;
               System.out.println("kích thước rectangle chuẩn : " + rectangle.getArea());
               rectangle.resize(4);
               System.out.println(" rectangle sau khi tăng " + rectangle.getArea());

           }
       }
    }

}
