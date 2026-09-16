package version2;

public class PieceWorkerEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { this.empID = empID; }

    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) { this.empName = empName; }

    public MyDate getBirthDate() { return birthDate; }
    public void setBirthDate(MyDate birthDate) { this.birthDate = birthDate; }

    public MyDate getDateHired() { return dateHired; }
    public void setDateHired(MyDate dateHired) { this.dateHired = dateHired; }

    public int getTotalPiecesFinished() { return totalPiecesFinished; }
    public void setTotalPiecesFinished(int totalPiecesFinished) {
        if (totalPiecesFinished >= 0) this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() { return ratePerPiece; }
    public void setRatePerPiece(double ratePerPiece) {
        if (ratePerPiece >= 0) this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        return (totalPiecesFinished * ratePerPiece) + ((totalPiecesFinished / 100) * (10 * ratePerPiece));
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate.getMonth() == currentMonth) salary += 5000.00;
        return salary;
    }

    public void displayPieceWorkerEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Pieces: %d | Rate/Piece: ₱%.2f\n",
                empID, empName.toString(), birthDate.toString(), totalPiecesFinished, ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format("PieceWorkerEmployee [ID: %d, Name: %s, Pieces: %d, Rate: ₱%.2f, Total Salary: ₱%.2f]",
                empID, empName.toString(), totalPiecesFinished, ratePerPiece, computeSalary());
    }
}