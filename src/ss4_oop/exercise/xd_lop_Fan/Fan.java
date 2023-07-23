package ss4_oop.exercise.xd_lop_Fan;

public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed ;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String tostring(){
        if(on){
            return " speed " + speed + " radius " + radius + " color " + color + " fan is on";
        }else {
            return " speed " + speed + " radius " + radius + " color " + color + " fan is off";
        }
    }
}
