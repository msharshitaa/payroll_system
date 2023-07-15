class Employee {
    void calculatePay(String employeeName, double monthlySalary) {
        System.out.println(employeeName + " " + monthlySalary * 12);
    }

    void calculatePay(String employeeName, double hourlyRate, double hoursWorked) {
        System.out.println(employeeName + " " + hourlyRate * hoursWorked);
    }
}

public class Payroll_System {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.calculatePay("Harshitaa", 50000.0);
        employee.calculatePay("Niveditha", 1000.0, 24.0);
    }
}
