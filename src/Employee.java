import java.util.Arrays;

public class Employee {
    private String fio;
    private int department;
    private int salary;
    private static int idCreator = 1;
    private int id;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = idCreator++;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "ФИО: " + fio +
                "; Отдел: " + department +
                "; Зарплата: " + salary +
                "; id: " + id +
                '}';
    }

}
