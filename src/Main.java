import java.sql.SQLOutput;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 5, 65_440);
        employees[1] = new Employee("Иванов Николай Иванович", 1, 65_000);
        employees[2] = new Employee("Иванов Иван Петрович", 5, 32_250);
        employees[3] = new Employee("Савельева Екатерина Петровна", 3, 95_310);
        employees[4] = new Employee("Игнатьева Светлана Викторовна", 4, 25_000);

        printEmployees();
        sumSalary();
        salaryMin();
        salaryMax();
        averageSalary();
        printName();
    }

    private static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void sumSalary() {
        double sum = 0d;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
    }

    private static void salaryMin() {
        double min = Double.MAX_VALUE;
        Employee employeeMinSal = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSal = employee;
            }
        }
        System.out.println("Минимальная зарплата за месяц: " + employeeMinSal);
    }

    private static void salaryMax() {
        double max = Double.MIN_VALUE;
        Employee employeeMaxSal = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSal = employee;
            }
        }
        System.out.println("Максимальная зарплата за месяц: " + employeeMaxSal);
    }

    private static void averageSalary() {
        double sum = 0d;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.println("Средняя зарплата сотрудников за месц: " + sum / count);
    }

    private static void printName() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                System.out.println("ФИО сотрудника: " + employee.getFio());
            }
        }
    }

}
