package ss7_abstract_interface.practice.animal_interface;

public class Test {
    public static void main(String[] args) {
      Animal[] animals = new Animal[2];
        for (int i = 0; i <animals.length ; i++) {
            if(i==0){
                animals[i] = new Tiger();
            }
            else {
                animals[i] = new Chicken();
            }
        }

       for(Animal anl : animals){
           System.out.println(anl.makeSound());

           if (anl instanceof Chicken){
              Edible edible= (Chicken) anl;
               System.out.println(edible.howtoEat());
           }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
