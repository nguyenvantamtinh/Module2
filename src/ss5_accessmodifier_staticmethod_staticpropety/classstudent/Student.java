package ss5_accessmodifier_staticmethod_staticpropety.classstudent;

public class Student {
    private String name = "jone";
    private static String classes = "CD2";

    public Student(){}

    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String tostring(){
        return name +" - " + classes;
    }
}
