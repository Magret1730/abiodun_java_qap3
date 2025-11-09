package Problem1;
/**
 * This class represents a Person with attributes such as name, age, and gender.
 * It provides constructors, getters, setters, and a toString method for easy representation.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 2024-9-9
 */
public class Person {
    // Attributes
    protected String myName ; // name of the person
    protected int myAge; // person’s age 
    protected String myGender; // “M” for male, “F” for female

    /**
     * Constructor for the Person class.
     * Initializes the person with name, age and gender
     * @param name
     * @param age
     * @param gender
     */
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /**
     * Getter for name
     * @return name of the person
     */
    public String getNAme() {
        return myName;
    }

    /**
     * Setter for name
     * @param name of the person
     */
    public void setName(String name) {
        myName = name;
    }

    /**
     * Getter for age
     * @return age of the person
     */
    public int getAge() {
        return myAge;
    }

    /**
     * Setter for age
     * @param age of the person
     */
    public void setAge(int age) {
        myAge = age;
    }

    /**
     * Getter for gender
     * @return gender of the person
     */
    public String getGender() {
        return myGender;
    }

    /**
     * Setter for gender
     * @param gender of the person
     */
    public void setGender(String gender) {
        myGender = gender;
    }

    /**
     * Overriden toString method to represent the Person object as a string.
     * @return String representation of the Person object
     */
    public String toString() { 
        return "Name: " + myName + ", age: " + myAge + ", gender: " + myGender;
    }
}