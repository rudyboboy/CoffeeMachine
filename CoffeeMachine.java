package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = reader.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = reader.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeans = reader.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        int cupsNeeded = reader.nextInt();

        int cupsAvailable = water/200;
        cupsAvailable = Math.min(cupsAvailable,(milk/50));
        cupsAvailable = Math.min(cupsAvailable,(coffeeBeans/15));

        if (cupsAvailable==cupsNeeded){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsAvailable<cupsNeeded){
            System.out.println("No, I can make only "+ cupsAvailable +" cup(s) of coffee");
        } else if (cupsAvailable>cupsNeeded){
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsAvailable-1) + " more than that)");
        }
    }
}
