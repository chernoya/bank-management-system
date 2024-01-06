public class Person {
    private String name;
    private int age;
    private int socialSecurityNumber;

    public Person(String firstName, String middleName, String lastName, int age, int socialSecurityNumber){
        this.name = firstName + " " + middleName + " " + lastName; 
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //setters
    public void sejetName(String newFirstName, String newMiddleName, String newLastName) {
        this.name = newFirstName + " " + newMiddleName + " " + newLastName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setSSN(int newSSN) {
        this.socialSecurityNumber = newSSN;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getSSN(){
        return this.socialSecurityNumber;
    }

}
