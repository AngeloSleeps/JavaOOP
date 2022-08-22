package model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private String id;

    public Student(String firstName, String lastName, int age, char gender, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.id = id;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student Info: \n"
                + "First Name: " + this.firstName + "\n"
                + "Last Name: " + this.lastName + "\n"
                + "Age: " + this.age + "\n"
                + "Gender: " + this.gender + "\n"
                + "Id Number: " + this.id;
    }
}
