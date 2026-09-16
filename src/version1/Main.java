package version1;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hourly Employee");
        HourlyEmployee he1 = new HourlyEmployee(100, "John Doe");
        he1.setTotalHoursWorked(35.0f);
        he1.setRatePerHour(150.0);

        HourlyEmployee he2 = new HourlyEmployee(101, "Alice Smith", 45.0f, 200.0);

        System.out.println("[displayHourlyEmployee()]");
        he1.displayHourlyEmployee();
        he2.displayHourlyEmployee();
        System.out.println("[toString()]");
        System.out.println(he1);
        System.out.println(he2);
        System.out.println();

        System.out.println("--- Piece Worker Employee Test ---");
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee();
        pwe1.setEmpID(200);
        pwe1.setEmpName("Jane Roe");
        pwe1.setTotalPiecesFinished(85);
        pwe1.setRatePerPiece(12.0);

        PieceWorkerEmployee pwe2 = new PieceWorkerEmployee(201, "Bob Jones", 250, 15.0);

        System.out.println("[displayPieceWorkerEmployee()]");
        pwe1.displayPieceWorkerEmployee();
        pwe2.displayPieceWorkerEmployee();
        System.out.println("[toString()]");
        System.out.println(pwe1);
        System.out.println(pwe2);
        System.out.println();

        System.out.println("--- Commission Employee Test ---");
        CommissionEmployee ce1 = new CommissionEmployee(300, "Chris Evans");
        ce1.setTotalSale(45000.0);

        CommissionEmployee ce2 = new CommissionEmployee(301, "Diana Prince", 150000.0);

        System.out.println("[displayCommissionEmployee()]");
        ce1.displayCommissionEmployee();
        ce2.displayCommissionEmployee();
        System.out.println("[toString()]");
        System.out.println(ce1);
        System.out.println(ce2);
        System.out.println();

        System.out.println("--- Base Plus Commission Employee Test ---");
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(400, "Clark Kent");
        bpce1.setTotalSale(80000.0);
        bpce1.setBaseSalary(20000.0);

        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee(401, "Bruce Wayne", 600000.0, 30000.0);

        System.out.println("[displayBasePlusCommissionEmployee()]");
        bpce1.displayBasePlusCommissionEmployee();
        bpce2.displayBasePlusCommissionEmployee();
        System.out.println("[toString()]");
        System.out.println(bpce1);
        System.out.println(bpce2);
    }
}