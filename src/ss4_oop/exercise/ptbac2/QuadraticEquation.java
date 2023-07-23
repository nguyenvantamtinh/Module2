package ss4_oop.exercise.ptbac2;
// phương trình bậc 2

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // hàm tạo nên để ở chế độ công khai
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public double  getDiscriminant(){
        return b*b - 4*a*c;
    }

}





