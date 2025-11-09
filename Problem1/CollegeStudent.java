package Problem1;
/**
 * CollegeStudent class that extends the Student class.
 * It includes additional attributes such as major and year.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 2024-9-9
 */
public class CollegeStudent extends Student {
    // Instance variables
    private String major; // Major of the student
    private int year;    // Year of the student

    /**
     * Constructor for the CollegeStudent class.
     * Initializes the CollegeStudent with name, age, gender, student ID number, GPA, major, and year.
     * @param myName
     * @param myAge
     * @param myGender
     * @param myIdNum
     * @param myGPA
     * @param year
     * @param major
     */
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.year = year;
        this.major = major;
    }

    /**
     * Getter for major
     * @return major of the student
     */
    public String getMajor() {
        return major;
    }

    /**
     * Setter for major
     * @param major major of the student
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Getter for year
     * @return year of the student
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for year
     * @param year year of the student
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * toString method for the CollegeStudent class
     * @return String representation of the CollegeStudent object
     */
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + year;
    }
}
