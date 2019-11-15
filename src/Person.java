public class Person {
    String name;
    int age;
    int height;
    int stamina;

    public void run() {
        stamina--;
    }
    public void sleep() {
        stamina += 12;
    }

    public boolean eatBanana() {
        return age >= 1500;

    }

    public int getAge() {
        return age;
    }
}
