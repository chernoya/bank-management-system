public class Customer extends Bank {
    public String name;
    public int age;
    public int socialSecurityNumber;

    public Customer(String firstName, String MiddleName, String lastName, int age, int socialSecurityNumber) {
        this.name = firstName + " " + MiddleName + " " + lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setName(String firstName, String middleName, String lastName) {
        this.name = firstName + " " + middleName + " " + lastName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setSSN(int newSSN) {
        this.socialSecurityNumber = newSSN;
    }



}

    