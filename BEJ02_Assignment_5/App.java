import java.io.*;
import java.util.*;

public class App {
    // List to store students
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Boolean variable to keep track of whether to exit the program
        boolean exit = false;

        System.out.println("Student Management System");

        // Main loop to keep the program running and offer options to the console user
        while (!exit) {
            // Print menu options
            System.out.println("Menu Options:");
            System.out.println("1. Add Student and Save to File");
            System.out.println("2. View Students (Load from File and Display Sorted by Performance)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Switch statement to handle user choices
            switch (choice) {
                // Add student and save to file
                case 1:
                    addStudent(scanner);
                    saveToFile();
                    break;
                // View students (load from file and display sorted by performance)
                case 2:
                    viewStudents();
                    break;
                // Exit the program
                case 3:
                    exit = true;
                    break;
                // Invalid choice
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to add a student
    private static void addStudent(Scanner scanner) {
        // Prompting user to enter student details
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
        String dateOfBirth = scanner.next();
        System.out.print("Enter Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Class: ");
        String studentClass = scanner.next();
        Map<String, Integer> subjects = new HashMap<>();
        System.out.print("Enter number of subjects: ");
        // Getting number of subjects
        int numberOfSubjects = scanner.nextInt();
        // Looping through the number of subjects and getting their names and grades
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter Subject Name: ");
            String subject = scanner.next();
            System.out.print("Enter Grade: ");
            int grade = scanner.nextInt();
            subjects.put(subject, grade);
        }
        // Creating and adding student to the list
        Student student = new Student(firstName, lastName, dateOfBirth, gender, studentClass, subjects);
        students.add(student);
        // Sort students by performance after adding a new student
        sortStudentsByPerformance();
        System.out.println("Student added successfully!");
    }

    // Method to view students (load from file and display sorted by performance)
    private static void viewStudents() {
        // Load students from file and display sorted by performance
        loadFromFile();
        sortStudentsByPerformance();

        // Display sorted students
        System.out.println("Students sorted by performance:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to save students to a file
    private static void saveToFile() {
        // File name
        String fileName = "students.txt";

        // Try-with-resources block to write to file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Write each student as a line in the file
            for (Student student : students) {
                // Append student details to the file
                writer.println(studentToFileString(student));
            }
            System.out.println("Students saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error saving students to file: " + e.getMessage());
        }
    }

    // Method to convert student to a string format from List for file storage using String builder
    private static String studentToFileString(Student student) {
        StringBuilder sb = new StringBuilder();
        sb.append(student.getFirstName()).append(",")
          .append(student.getLastName()).append(",")
          .append(student.getDateOfBirth()).append(",")
          .append(student.getGender()).append(",")
          .append(student.getStudentClass()).append(",");
        
        // Append subjects and grades
        Map<String, Integer> subjects = student.getSubjects();
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }

        return sb.toString();
    }

    // Method to load students from a file
    private static void loadFromFile() {
        // File name
        String fileName = "students.txt";

        students.clear(); // Clear existing students

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student student = parseStudentFromString(line);
                students.add(student);
            }
            System.out.println("Students loaded from file successfully!");
        } catch (IOException e) {
            System.out.println("Error loading students from file: " + e.getMessage());
        }
    }

    // Method to parse a string into a Student object
    private static Student parseStudentFromString(String line) {
        String[] parts = line.split(",");
        String firstName = parts[0];
        String lastName = parts[1];
        String dateOfBirth = parts[2];
        String gender = parts[3];
        String studentClass = parts[4];
        
        Map<String, Integer> subjects = new HashMap<>();
        for (int i = 5; i < parts.length; i++) {
            String[] subjectGrade = parts[i].split(":");
            String subject = subjectGrade[0];
            int grade = Integer.parseInt(subjectGrade[1]);
            subjects.put(subject, grade);
        }

        return new Student(firstName, lastName, dateOfBirth, gender, studentClass, subjects);
    }

    // Method to sort students by performance
    private static void sortStudentsByPerformance() {
        // Sorting the list based on average grade in descending order
        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
    }
}
