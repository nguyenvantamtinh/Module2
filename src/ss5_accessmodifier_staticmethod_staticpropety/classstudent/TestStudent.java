package ss5_accessmodifier_staticmethod_staticpropety.classstudent;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.tostring());

        Student student1 = new Student();
        student1.setName("eva");
        student1.setClasses("CD3");
        System.out.println(student1.tostring());
    }

}
