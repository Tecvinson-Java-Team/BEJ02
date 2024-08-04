import java.util.*;

class Student {
    // class variable to keep track of the last assigned student ID
    private static int idCounter = 0;
    
    // variables for student attributes
    private int studentId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String studentClass;
    private Map<String, Integer> subjects; // Map to store subjects and their respective grades

    // Constructor to initialize a student object
    public Student(String firstName, String lastName, String dateOfBirth, String gender, String studentClass, Map<String, Integer> subjects) {
        this.studentId = ++idCounter; // Increment ID counter and assign to student
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.studentClass = studentClass;
        this.subjects = subjects;
    }

    // Getters for retrieving student information
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    // Method to calculate the average grade of the student to be used to sort students
    public double getAverageGrade() {
        // Initialize sum to 0
        int sum = 0;
        // Loop through each grade in the subjects map
        for (int grade : subjects.values()) {
            sum += grade; // Add each grade to the sum
        }
        // Calculate the average
        double average;
        if (subjects.size() > 0) {
            average = (double) sum / subjects.size();
        } else {
            average = 0;
        }
        return average;
    }
    

    // Override toString method to print student information
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", DOB: " + dateOfBirth + ", Gender: " + gender +
               ", Class: " + studentClass + ", Subjects: " + subjects;
    }
}
