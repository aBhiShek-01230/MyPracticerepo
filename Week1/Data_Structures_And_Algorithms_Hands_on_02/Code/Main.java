package Week1.Data_Structures_And_Algorithms_Hands_on_02.Code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting revenue: ");
        double revenue = sc.nextDouble();

        System.out.print("Enter starting expenses: ");
        double expenses = sc.nextDouble();

        System.out.print("Enter revenue growth rate: ");
        double revenueGrowthRate = sc.nextDouble();

        System.out.print("Enter expense growth rate: ");
        double expenseGrowthRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        System.out.println("\n Forecast Result:");
        FinancialForecaster forecaster = new FinancialForecaster();
        forecaster.generateForecast(revenue, expenses, revenueGrowthRate, expenseGrowthRate, years);
        forecaster.displayForecast();


        sc.close();
    }
}
