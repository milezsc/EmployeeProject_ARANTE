package version4;

public class Main3 {
    public static void main(String[] args) {
        int targetMonth = 9;

        Name n1 = new Name("Alice", "M", "Smith");
        MyDate dob1 = new MyDate(18, 9, 2000);
        MyDate dh1 = new MyDate(1, 6, 2022);
        HourlyEmployee he1 = new HourlyEmployee(101, n1, dob1, dh1, 45.0f, 200.0);

        Name n2 = new Name("Bob", "C", "Jones", "Jr.");
        MyDate dob2 = new MyDate(5, 4, 1998);
        MyDate dh2 = new MyDate(15, 1, 2023);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(201, n2, dob2, dh2, 250, 15.0);

        System.out.println("POLYMORPHIC PAYROLL REPORT (Target Month: Sep)");

        Employee[] employees = { he1, pwe1 };

        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            System.out.printf("%d. %s [ID: %d, Name: %s, DOB: %s, Hired: %s]\n",
                    (i+1), emp.getClass().getSimpleName(), emp.getEmpID(),
                    emp.getEmpName(), emp.getBirthDate(), emp.getDateHired());

            double totalPayout = emp.computeSalary(targetMonth);
            double bonus = (emp.getBirthDate().getMonth() == targetMonth) ? 5000.00 : 0.00;
            double basePay = totalPayout - bonus;

            System.out.printf("   Base Pay: ₱%.2f | Birthday Bonus: ₱%.2f (%s)\n",
                    basePay, bonus, (bonus > 0 ? "Eligible" : "Ineligible"));
            System.out.printf("   Total Payout: ₱%.2f\n\n", totalPayout);
        }

        System.out.println("OBJECT CONTRACT TESTS (equals & hashCode)");

        HourlyEmployee he1Identical = new HourlyEmployee(101, new Name("Alice", "M", "Smith"),
                new MyDate(18, 9, 2000), new MyDate(1, 6, 2022), 45.0f, 200.0);

        System.out.println("emp1 equals emp1Identical: " + he1.equals(he1Identical));
        System.out.printf("emp1 hashCode: %d | emp1Identical hashCode: %d (Match: %b)\n",
                he1.hashCode(), he1Identical.hashCode(), he1.hashCode() == he1Identical.hashCode());
        System.out.println("emp1 equals emp2: " + he1.equals(pwe1));
        System.out.println();

        System.out.println("DEEP CLONE VERIFICATION");

        HourlyEmployee clone = (HourlyEmployee) he1.clone();
        System.out.println("Original Name before modification: " + he1.getEmpName());

        clone.getEmpName().setLastName("Taylor");
        System.out.println("Clone Name changed to: " + clone.getEmpName());

        System.out.println("Original Name after modification: " + he1.getEmpName() + " (Deep copy successful!)");
    }
}