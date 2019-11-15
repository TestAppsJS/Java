import java.util.Scanner;

public class TablaInmultirii {
    public static void main(String[] args) {

        System.out.println("Introduceti numarul:  ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i= 1;
           /* while(i <= 9 ) {                                  Utilizam While
            System.out.println(i + " x " + n +" = " + i * n);
            i++;
        }*/
        for(i = 1; i <= 9; i++) {                               // Utilizam for
            System.out.println(i + " x " + n +" = " + i * n);
        }
    }
}
