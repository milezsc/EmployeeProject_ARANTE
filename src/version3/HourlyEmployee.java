package version3;

import java.util.Objects;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, birthDate, dateHired);
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public float getTotalHoursWorked() { return totalHoursWorked; }
    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked >= 0) this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() { return ratePerHour; }
    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour >= 0) this.ratePerHour = ratePerHour;
    }

    @Override
    public double computeSalary(int currentMonth) {
        double basePay = 0;
        if (totalHoursWorked <= 40) {
            basePay = totalHoursWorked * ratePerHour;
        } else {
            basePay = (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour * 1.5));
        }
        return basePay + super.computeSalary(currentMonth);
    }

    public void displayHourlyEmployee() {
        super.displayEmployee();
        System.out.printf("Hours: %.2f | Rate: ₱%.2f/hr\n", totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Hours: %.2f, Rate: ₱%.2f, Total Salary: ₱%.2f",
                totalHoursWorked, ratePerHour, computeSalary());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        HourlyEmployee that = (HourlyEmployee) obj;
        return Float.compare(that.totalHoursWorked, totalHoursWorked) == 0 &&
                Double.compare(that.ratePerHour, ratePerHour) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalHoursWorked, ratePerHour);
    }
}