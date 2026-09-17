package version4;

public class EmployeeRoster {
    private Employee empList[];
    private int max;
    private int count;

    public EmployeeRoster() {
        this.max = 10;
        empList = new Employee [max];
        this.count = 0;
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new Employee[this.max];
        this.count = count;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean addEmployee (Employee emp){
        return(count < max) ? (empList[count++] = emp) != null : false;
    }

    public boolean removeEmployee(int empID){
        int i;
        for(i = 0; i < count && empList[i].getEmpID() != empID){}
        Employee newEmp = (i < count - 1) ? empList[i] : null;
        if(newEmp != null){
            for(int j = i;  )
        }
    }
}
