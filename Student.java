import java.lang.Math;
public class Student extends Person {

  private double gpa;
  public String toString() {
      return "Student: " + id +  ". " + name + " " + surname;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student() {

    }

    @Override
    public double getPaymentAmount() {
        if (this.gpa > 2.67) {
            return 36660.00;
        }
        else return 0;
    }
    public String getPosition() {
      return "Student";
    }

    public Student(String name, String surname, double gpa) {
      super(name,surname);
      this.gpa = gpa;
      this.id = id_imp++;
    }
}

