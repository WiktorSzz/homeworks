package pl.kurs.homeworks.lessonenumeratedtype;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("Marek", "Stasiak", JobPosition.SIERŻANT, new Prize[]{Prize.GIFT, Prize.MONEY}, Salary.PRIMARY);

        Employee employee2 = new Employee("Jurek", "Policjant", JobPosition.ASPIRANT, new Prize[]{Prize.VOUCHER, Prize.GIFT}, Salary.HIGH);

        Employee employee3 = new Employee("Dominik", "Pion", JobPosition.POSTERUNKOWY, new Prize[]{Prize.MONEY, Prize.VOUCHER}, Salary.MEDIUM);

        System.out.println(employee);
        System.out.println("--------------------------");
        System.out.println(employee2);
        System.out.println("--------------------------");
        System.out.println(employee3);
    }
}