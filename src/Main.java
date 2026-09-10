import version1.HourlyEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hourly Employee");
        HourlyEmployee he1 = new HourlyEmployee(100, "John Doe");
        he1.setTotalHoursWorked(35.0f);
        he1.setRatePerHour(150.0);

        HourlyEmployee he2 = new HourlyEmployee(101, "Alice Smith", 45.0f, 200.0);
    }
}