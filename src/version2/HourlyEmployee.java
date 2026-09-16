package version2;

public class HourlyEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }
    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public float getTotalHoursWorked() { return totalHoursWorked; }
    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked >= 0) this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() { return ratePerHour; }
    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour >= 0) this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        if (totalHoursWorked <= 40) {
            return totalHoursWorked * ratePerHour;
        } else {
            double regularPay = 40 * ratePerHour;
            double overtimePay = (totalHoursWorked - 40) * (ratePerHour * 1.5);
            return regularPay + overtimePay;
        }
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate.getMonth() == currentMonth) {
            salary += 5000.00;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Hours: %.2f | Rate: ₱%.2f/hr\n",
                empID, empName.toString(), birthDate.toString(), dateHired.toString(),
                totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Hours: %.2f, Rate: ₱%.2f, Total Salary: ₱%.2f]",
                empID, empName.toString(), birthDate.toString(), dateHired.toString(),
                totalHoursWorked, ratePerHour, computeSalary());
    }
}