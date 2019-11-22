package exceptions;

public class Demo {
    public static void main(String[] args) {
        int y = 10;
        try {
            int x = 100 / 0;
            y = 5;
            System.out.println();
        } catch (Exception e) {
            System.out.println("Impartirea nu poate fi facuta!");
        }

    }
}
