package version1;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;
    private double baseSalary;

    BasePlusCommissionEmployee(){
        empID = 0;
        empName = "N/A";
        totalSale = 0.0;
        baseSalary = 0.0;
    }


    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
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

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        double commissionRate;
        if (totalSale < 50000) commissionRate = 0.05;
        else if (totalSale < 100000) commissionRate = 0.10;
        else if (totalSale < 500000) commissionRate = 0.15;
        else commissionRate = 0.20;

        return baseSalary + (totalSale * commissionRate);
    }

    public void displayBasePlusCommissionEmployee(){
        System.out.printf("ID: %d | Name: %s | Total Sale: ₱%.2f | Base Salary: ₱%.2f\n", empID, empName, totalSale, baseSalary);
    }
    @Override
    public String toString(){
        return String.format("BasePlusCommissionEmployee [ID: %d | Name: %s | Total Sale: ₱%.2f | Base Salary: ₱%.2f\n]", empID, empName, totalSale, baseSalary, computeSalary());
    }

}
