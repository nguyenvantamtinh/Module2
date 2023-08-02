package ss7_abstract_interface.practice.animal_interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken : ò ó o";
    }

    @Override
    public String howtoEat() {
        return "làm thịt";
    }
}
