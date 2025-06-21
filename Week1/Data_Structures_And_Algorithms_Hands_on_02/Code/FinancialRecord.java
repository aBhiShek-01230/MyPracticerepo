package Week1.Data_Structures_And_Algorithms_Hands_on_02.Code;

public class FinancialRecord {
    int year;
    double revenue;
    double expenses;
    double profit;

    public FinancialRecord(int year, double revenue, double expenses) {
        this.year = year;
        this.revenue = revenue;
        this.expenses = expenses;
        this.profit = revenue - expenses;
    }

    @Override
    public String toString() {
        return "Year " + year +
               " | Revenue: ₹" + String.format("%.2f", revenue) +
               " | Expenses: ₹" + String.format("%.2f", expenses) +
               " | Profit: ₹" + String.format("%.2f", profit);
    }
}

