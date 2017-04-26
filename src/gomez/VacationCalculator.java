package gomez;
import java.util.*;
/**
 * Created by fernandogomez on 4/26/17.
 */
public class VacationCalculator {

    public static void main(String[] args) {


        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...

        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 5);


        System.out.format("The cost of your vacation to Japan is $%.2f%n", japanCost);
        System.out.format("The cost of your vacation to Europe is $%.2f%n", europeCost);
        System.out.format("The cost of your vacation to Mexico is $%.2f%n", mexicoCost);
    }

    public float calculateVacationCost(Destination dest, int days) {


        ArrayList<Expense> expenses = new ArrayList<Expense>();

        Cruise c = new Cruise(dest);
        Dining d = new Dining(dest, days);
        Lodging l = new Lodging(dest, days);

        expenses.add(c);
        expenses.add(d);
        expenses.add(l);

        // or expenses.add(new Lodging(dest, days));

        return tallyExpenses(expenses);
    }

    float tallyExpenses(List<Expense> expenses) {

        float sum = 0;

        for(Expense element : expenses) {

            sum += element.getCost();
        }

        return sum;
    }
}
