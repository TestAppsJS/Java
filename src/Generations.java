import java.util.Scanner;

public class Generations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti varsta: ");
        int age = in.nextInt();
        String generatia;
        if (age <= 0) {
            //generatia = "Valoare incorecta";
            System.out.println("Varsta incorecta");
            return;
        }
        else if (age < 6) {
            generatia = "Alfa";
        }
        else if (age <=20) {
            generatia = "Z";
        }
        else {
            generatia = "Builders";
        }
        System.out.println("Generatia este: " + generatia);
    }
}
