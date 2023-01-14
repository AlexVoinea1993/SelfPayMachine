import java.util.Scanner;

public class Main {

    /*
        1. Welcome message!
        2. The machine will ask: What is the value of your purchase?
        3. The client will enter the value of the purchase
        4. The machine will ask for the money
        5. The total sum of money that is introduced in the cash machine by the client (for example 500 euros)
        6. The cash machine will calculate and print the remaining money for the client
        7. The cash machine will print every banknote and coin from the total sum of the money
         */
    public static void main(String[] args) {
        System.out.println("Welcome to Carrefour!");
        System.out.println("What is the value of your purchase?");
        Scanner reader = new Scanner(System.in);
        double valueOfThePurchase = reader.nextDouble();
        System.out.println("The total, purchase is... " + valueOfThePurchase + " euro");
        System.out.println("Please enter the money");
        double moneyEntered = reader.nextDouble();
        System.out.println("The total sum of money received " + moneyEntered + " euro");
        double change = moneyEntered - valueOfThePurchase;
        System.out.println("Your change is " + change + " euro");

        while (change >= 200) {
            System.out.println("The cash machine offered a 200 euro banknote as change");
            change -= 200;
        }
        while (change >= 100) {
            System.out.println("The cash machine offered a 100 euro banknote as change");
            change -= 100;
        }
        while (change >= 50) {
            System.out.println("The cash machine offered a 50 euro banknote as change");
            change -= 50;
        }
        while (change >= 20) {
            System.out.println("The cash machine offered a 20 euro banknote as change");
            change -= 20;
        }
        while (change >= 10) {
            System.out.println("The cash machine offered a 10 euro banknote as change");
            change -= 10;
        }
        while (change >= 5) {
            System.out.println("The cash machine offered a 5 euro banknote as change");
            change -= 5;
        }
        while (change >= 2) {
            System.out.println("The cash machine offered a 2 euro banknote as change");
            change -= 2;
        }
        while (change >= 1) {
            System.out.println("The cash machine offered a 1 euro coin as change");
            change -= 1;
        }
        while (change >= 0.5) {
            System.out.println("The cash machine offered a 50 cents coin as change");
            change -= 0.5;
        }
        while (change >= 0.25) {
            System.out.println("The cash machine offered a 25 cents coin as change");
            change -= 0.25;
        }
        while (change >= 0.10) {
            System.out.println("The cash machine offered a 10 cents coin as change");
            change -= 0.10;
        }
        while (change >= 0.05) {
            System.out.println("The cash machine offered a 5 cents coin as change");
            change -= 0.05;
        }
        while (change >= 0.01) {
            System.out.println("The cash machine offered a 1 cent coin as change");
            change -= 0.01;
        }
        System.out.println("Thank you for your purchase!");
    }
}
