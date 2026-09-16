package version2;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("--- Name & Date Output Verification ---");
        Name testName = new Name("Alice", "Mary", "Smith");
        MyDate testDate = new MyDate(18, 9, 2026);

        System.out.print("Name: ");
        testName.displayName();
        System.out.print("Date: ");
        testDate.displayDate();
        System.out.println();

        System.out.println("--- Hourly Employee Payroll Test ---");

        Name heName = new Name("Alice", "Mary", "Smith");
        MyDate heDOB = new MyDate(18, 9, 2000);
        MyDate heHired = new MyDate(1, 6, 2022);

        HourlyEmployee he1 = new HourlyEmployee(101, heName, heDOB, heHired, 45.0f, 200.0);

        System.out.println("[displayHourlyEmployee()]");
        he1.displayHourlyEmployee();

        System.out.println("[toString()]");
        System.out.println(he1);

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (Oct) Salary: ₱%.2f\n", he1.computeSalary(10));
        System.out.printf("Birth Month (Sep) Salary (+₱5,000.00): ₱%.2f\n", he1.computeSalary(9));
    }
}