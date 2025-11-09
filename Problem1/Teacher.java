package Problem1;
/**
 * Teacher class that extends Person class
 * It includes additional attributes such as subject taught and annual salary.
 *
 * Author: Abiodun Magret Oyedele
 * Date: 2024-9-9
 */
public class Teacher extends Person {
    // Instance variables
    private String subject; // subject taught by the teacher
    private double salary; // annual salary of the teacher

    /**
     * Constructor for the Teacher class.
     * @param myName
     * @param myAge
     * @param myGender
     * @param subject
     * @param salary
     */
    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }

    /**
     * Getter for subject
     * @return subject taught by the teacher
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Setter for subject
     * @param subject subject taught by the teacher
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Getter for salary
     * @return annual salary of the teacher
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter for salary
     * @param salary annual salary of the teacher
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * toString method for the Teacher class
     * @return String representation of the Teacher object
     */
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}
