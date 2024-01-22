public class Employee extends Person {
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        this();
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" +
                id + ' ' +
                name + ' ' +
                surname + ' ';

    }
}