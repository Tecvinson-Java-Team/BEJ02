public class Employee {

        /* Initializing all the variables for Employee class, all set to private except
           Allowance and Vacation
        */

        private String title;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String nationality;
        public Allowance allowance;
        public Vacation vacation;

        //This is the employee constructor for employee information
        public Employee(String title, String firstName, String lastName, String email, String phoneNumber, String nationality) {
            this.title = title;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.nationality = nationality;
            this.allowance = new Allowance();
            this.vacation = new Vacation();
        }

        //This method displays initial basic information of employee
        public void displayBasicInfo() {
            System.out.println("Below are the employee information");
            System.out.println("Title: " + title);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Nationality: " + nationality);
        }

        //This method displays updated basic information of employee
        public void updateBasicInfo(String title, String firstName, String lastName, String email, String phoneNumber, String nationality) {
            this.title = title;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.nationality = nationality;
        }
    }

