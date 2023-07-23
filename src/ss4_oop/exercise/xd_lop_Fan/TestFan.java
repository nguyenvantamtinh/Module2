package ss4_oop.exercise.xd_lop_Fan;

import ss6.xd_lop_fan.Fan;

public class TestFan {
    public static void main(String[] args) {
        ss6.xd_lop_fan.Fan fan = new ss6.xd_lop_fan.Fan();
        System.out.println(fan.tostring());

        ss6.xd_lop_fan.Fan fan1 = new ss6.xd_lop_fan.Fan();
        fan1.setSpeed(ss6.xd_lop_fan.Fan.fast);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.tostring());

        ss6.xd_lop_fan.Fan fan2 = new ss6.xd_lop_fan.Fan();
        fan2.setSpeed(Fan.medium);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.tostring());



    }
}
