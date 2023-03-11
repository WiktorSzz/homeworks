package pl.kurs.homeworks.lessonenumeratedtype.models;

public enum Salary {
    PRIMARY(3200),
    MEDIUM(4400),
    HIGH(5050);

    private double salary;

    Salary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
