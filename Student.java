/**
 * Student class that extends Person
 * It includes additional attributes such as student ID number and GPA.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 2024-9-9
 */
class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    /**
     * Constructor for the Student class.
     * Initializes the Student with name, age, gender, student ID number and GPA.
     * @param name
     * @param age
     * @param gender
     * @param idNum
     * @param gpa
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    
    } }
