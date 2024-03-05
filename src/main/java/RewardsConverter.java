import java.util.Scanner;
import java.util.Scanner;


public class RewardValue extends GraphicsProgram{
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash * 0.0035; // Conversion rate
    }

    // Constructor accepting miles value
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles / 0.0035; // Conversion rate
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
