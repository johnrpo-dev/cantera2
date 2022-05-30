package models;

public class Employee extends SofkianPerson {

    private int idEmployee;
    private double salary;
    private static int countEmployee;

    public Employee(String name, double salary) {
        super(name);
        this.idEmployee = ++Employee.countEmployee;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sueldo) {
        this.salary = sueldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("idEmployee=").append(idEmployee);
        sb.append(", name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append(",\nsofkian Person: {=").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }
}
