package Week1.Design_Patterns_And_Prniciples_Hands_On_02.Code;
public class Main {
    public static void main(String[] args) {
        Employee dev = EmployeeFactory.getEmployee("developer");
        System.out.println(dev.getRole() + " earns $" + dev.getSalary());

        Employee mgr = EmployeeFactory.getEmployee("manager");
        System.out.println(mgr.getRole() + " earns $" + mgr.getSalary());

    }
}
