package Week1.Design_Patterns_And_Prniciples_Hands_On_02.Code;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "developer":
                return new Developer();
            case "manager":
                return new Manager();
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}