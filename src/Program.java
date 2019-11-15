public class Program {
    public static void main(String[] args) {
        Person creature = new Person("Yeti", 2000, 220, 10);


        System.out.println(creature.getName() + " have " + creature.getAge() + " years!");

        creature.run();
        creature.run();
        creature.run();
        System.out.println(creature.getName() + " have energy " + creature.getStamina() + "!");
        creature.sleep();
        System.out.println(creature.getName() + " have energy " + creature.getStamina() + "!");

        if(creature.eatBanana()) {
            System.out.println(creature.getName() + " eat Bananas!");
        }
        Dog lessie = new Dog();
        lessie.size = 90;
        lessie.bark();
        System.out.println();
        }
    }

