package version2;

public class BasePlusCommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
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
    public void setTotalSale(double totalSale) { if (totalSale >= 0) this.totalSale = totalSale; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { if (baseSalary >= 0) this.baseSalary = baseSalary; }

    public double computeSalary() {
        double commissionRate;
        if (totalSale < 50000) commissionRate = 0.05;
        else if (totalSale < 100000) commissionRate = 0.10;
        else if (totalSale < 500000) commissionRate = 0.15;
        else commissionRate = 0.20;

        return baseSalary + (totalSale * commissionRate);
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate.getMonth() == currentMonth) salary += 5000.00;
        return salary;
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Sale: ₱%.2f | Base: ₱%.2f\n",
                empID, empName.toString(), birthDate.toString(), totalSale, baseSalary);
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, Base: ₱%.2f, Sales: ₱%.2f, Total Salary: ₱%.2f]",
                empID, empName.toString(), baseSalary, totalSale, computeSalary());
    }
}