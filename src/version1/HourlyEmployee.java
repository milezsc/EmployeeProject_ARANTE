package version1;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary () {
        //5 days 8 hours = 40 hours

        double salary = totalHoursWorked * ratePerHour;
        double otSalary = (totalHoursWorked - 40 * ratePerHour * 1.5);
        if(totalHoursWorked <= 40) {
            return salary;
        } else {
            return (otSalary + salary);
        }

    void displayHourlyEmployee() {
            System.out.printf("ID: %d | Name: %s | Hours: %.2f | Rate: ₱%.2f/hr\n", empID, empName, totalHoursWorked, ratePerHour);
        }

    }

    @Override
    public String toString() {
        return String.format("PieceWorkerEmployee[ID: %d Name: %s Working Hours: %d Rate: ₱%d Total Salary: ₱%.2f]", empName, empID, totalHoursWorked, ratePerHour, computeSalary());
    }
}