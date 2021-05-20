package ExeptionsTestingLab204;

public enum Occupation {
    Doctor(90_000),
    Driver(40_000),
    Worker(50_000),
    Sales(70_000);

    private int Salary;

    Occupation(int salary) {
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }
}
