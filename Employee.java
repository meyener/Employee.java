public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsInCompany = currentYear - hireYear;
        if (yearsInCompany < 10) {
            return salary * 0.05;
        } else if (yearsInCompany < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}