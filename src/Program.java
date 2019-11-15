public class Program {
    public static void main(String[] args) {
        Person creature = new Person();
        creature.name = "Yeti";
        creature.age = 2000;
        creature.height = 220;
        creature.age++;
        creature.stamina= 10;

        System.out.println(creature.name + " have " + creature.age + " years!");

        creature.run();
        creature.run();
        creature.run();
        System.out.println(creature.name + " have energy " + creature.stamina + "!");
        creature.sleep();
        System.out.println(creature.name + " have energy " + creature.stamina + "!");

        if(creature.eatBanana()) {
            System.out.println(creature.name + " eat Bananas!");
        }
        Dog lessie = new Dog();
        lessie.size = 90;
        lessie.bark();
        System.out.println();
        }
    }

