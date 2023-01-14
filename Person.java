public abstract class Person implements Payable, Comparable<Person> {
    int id;
    String name;
    String surname;
    static int id_imp = 1;

    public String toString() {
        return id + ". " + name + " " + surname;
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
    public Person() {


    }
    Person(String name, String surname){

        this.name = name;
        this.surname = surname;
    }
    public abstract  String getPosition() ;
    public abstract double getPaymentAmount();

    public int compareTo(Person p){

       if (this.getPaymentAmount()==p.getPaymentAmount()) {
           return 0;

       }
       else if (this.getPaymentAmount()>p.getPaymentAmount()) {
           return 1;
       }
        else if (this.getPaymentAmount()<p.getPaymentAmount()) {
            return -1;
       }
    return 0;
    }

}
