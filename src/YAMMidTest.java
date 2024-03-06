import java.util.Scanner;

public class YAMMidTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees work in your business?");
        int numEmp = scanner.nextInt();

        System.out.println("How much do you earn from your grocery business?");
        int groceryIncome = scanner.nextInt();

        GroceryBusiness groceryBusiness = new GroceryBusiness(numEmp, groceryIncome);
        System.out.println("\nThe Data You Just Entered for Your Grocery Business:\n" + groceryBusiness);

        System.out.println("\nIn which year you established your grocery business?");
        int establishedYear = scanner.nextInt();
        groceryBusiness.yearEstablished(establishedYear);

        System.out.println("\nWhat is the price for onion per kilo?");
        double onionPrice = scanner.nextDouble();

        System.out.println("\nWhat is the price for coke per bottle?");
        double cokePrice = scanner.nextDouble();
        scanner.close();

        System.out.println("\nPrice List:");
        groceryBusiness.onionPrice(onionPrice);
        groceryBusiness.cokePrice(cokePrice);
    }
}

interface Onion {
    void onionPrice(double onionPrice);
}

interface Coke {
    void cokePrice(double cokePrice);
}

abstract class Business {
    int numEmp;

    Business(int numEmp) {
        this.numEmp = numEmp;
    }

    abstract int numEmployee();

    @Override
    public String toString() {
        return "\nNumber of Employees in Your Business: " + numEmp;
    }
}

class GroceryBusiness extends Business implements Onion, Coke {
    int groceryIncome;

    GroceryBusiness(int numEmp, int groceryIncome) {
        super(numEmp);
        this.groceryIncome = groceryIncome;
    }

    @Override
    int numEmployee() {
        return numEmp;
    }

    @Override
    public void onionPrice(double onionPrice) {
        System.out.println("The onion price per kilo is: " + onionPrice);
    }

    @Override
    public void cokePrice(double cokePrice) {
        System.out.println("The price per bottle of Coke is: " + cokePrice);
    }

    void yearEstablished(int year) {
        System.out.println("You established your business in year: " + year);
    }

    @Override
    public String toString() {
        return super.toString() + "\ngroceryIncome: " + groceryIncome;
    }
}
