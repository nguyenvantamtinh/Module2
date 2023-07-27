package ss6_kethua.point_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();


        MovablePoint movablePoint = new MovablePoint(1,2,3,5);
        System.out.println(movablePoint.move());
    }
}
