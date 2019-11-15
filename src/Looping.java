public class Looping {
    public static void main(String[] args) {
        //int n = 5;
       // while( n >=2) {
           // System.out.println(n);
        int money = 0;
        int chocolates = 0;
        int chocolatePrice = 1;

         /* while(money > chocolatePrice) {
            chocolates++;
            money = money - chocolatePrice;
        }
        System.out.println("I have " + chocolates + " chocolates");*/
        do {
            chocolates++;
           // money = money - chocolatePrice;
            money -= chocolatePrice;
        } while (money > chocolatePrice);
        System.out.println("I have " + chocolates + " chocolates");
        }
    }

