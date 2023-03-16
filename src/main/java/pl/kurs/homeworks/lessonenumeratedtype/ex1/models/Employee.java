package pl.kurs.homeworks.lessonenumeratedtype.ex1.models;

import java.util.Arrays;

public class Employee {
    private String firstName;
    private String secondName;
    private JobPosition jobPosition;
    private Prize[] prize;
    private Salary salary;

    public Employee(String firstName, String secondName, JobPosition jobPosition, Prize[] prize, Salary salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobPosition = jobPosition;
        this.prize = prize;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", jobPosition=" + jobPosition +
                ", prize=" + Arrays.toString(prize) +
                ", salary=" + salary +
                '}';
    }
}
