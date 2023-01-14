public class Employee extends Person{

    private String position;
    private double salary;

    public String toString() {
        return "Employee: " + this.id + ". " + name + " " + surname;
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
    public Employee() {

    }
    public Employee(String name, String surname, String position,double salary) {
        super(name, surname);
        this.position = position;
        this.salary =salary;
        this.id = id_imp++;
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }

}



