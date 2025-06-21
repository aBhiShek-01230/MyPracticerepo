package Week1.Data_Structures_And_Algorithms_Hands_on_02.Code;

import java.util.*;

public class FinancialForecaster {
    private List<FinancialRecord> forecast = new ArrayList<>();

    public void generateForecast(double initialRevenue, double initialExpenses, double revenueGrowthRate, double expenseGrowthRate, int years) {
        for (int i = 1; i <= years; i++) {
            if (i == 1) {
                forecast.add(new FinancialRecord(i, initialRevenue, initialExpenses));
            } else {
                FinancialRecord last = forecast.get(forecast.size() - 1);
                double newRevenue = last.revenue * (1 + revenueGrowthRate);
                double newExpenses = last.expenses * (1 + expenseGrowthRate);
                forecast.add(new FinancialRecord(i, newRevenue, newExpenses));
            }
        }
    }

    public void displayForecast() {
        for (FinancialRecord record : forecast) {
            System.out.println(record);
        }
    }
}
