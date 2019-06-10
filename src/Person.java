public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;


    public Person(String firstName, String lastName, int age, String pesel) throws Exception {
        if (firstName.length() >= 2) {
            this.firstName = firstName;
        } else throw new NameUndefinedException("Imię za krótkie");
        if (lastName.length() >= 2)
            this.lastName = lastName;
        else throw new NameUndefinedException("Nazwisko za krótkie");
        if (age >= 1)
            this.age = age;
        else throw new IncorrectAgeException("wiek większy lub równy jeden rok ");
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
