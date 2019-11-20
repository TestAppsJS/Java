public class Program {
    public static void main(String[] args) {
        Person creature = new Person("Yeti", 2000, 220, 10);

       Person andrei = new Student("Andrei", 25, 180, 100, "A");
        andrei.grow(10);

        if (andrei instanceof  Student) {
            System.out.println(andrei.getName() + " este student");
        }

        Student s = (Student) andrei;
        System.out.println();
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());
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
        lessie.bark(5);
        System.out.println();
        }
    }

