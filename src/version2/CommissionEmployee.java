package version2;

public class CommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double totalSale;

    public CommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public CommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalSale(totalSale);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { this.empID = empID; }

    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) { this.empName = empName; }

    public MyDate getBirthDate() { return birthDate; }
    public void setBirthDate(MyDate birthDate) { this.birthDate = birthDate; }

    public MyDate getDateHired() { return dateHired; }
    public void setDateHired(MyDate dateHired) { this.dateHired = dateHired; }

    public double getTotalSale() { return totalSale; }
    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) this.totalSale = totalSale;
    }

    public double computeSalary() {
        if (totalSale < 50000) return totalSale * 0.05;
        else if (totalSale < 100000) return totalSale * 0.10;
        else if (totalSale < 500000) return totalSale * 0.15;
        else return totalSale * 0.20;
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate.getMonth() == currentMonth) salary += 5000.00;
        return salary;
    }

    public void displayCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Total Sale: ₱%.2f\n",
                empID, empName.toString(), birthDate.toString(), totalSale);
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee [ID: %d, Name: %s, Total Sale: ₱%.2f, Salary: ₱%.2f]",
                empID, empName.toString(), totalSale, computeSalary());
    }
}