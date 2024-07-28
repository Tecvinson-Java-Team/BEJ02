public class HRMain {

    public static void main(String[] args) {

        System.out.println("This is the initial basic info");

        Employee emp = new Employee("Mr.", "Joe", "Musa", "joemusa@mail.com", "08035678753", "Nigerian");

        //The line of code below calls the parameters of the emp variable
        emp.displayBasicInfo();

        //The line of code below calls the updated parameters of the emp variable
        System.out.println("\nThis is the updated basic info");
        emp.updateBasicInfo("Dr.", "Joe", "Musa", "joemusa@outlook.com", "08035654234", "Ghanaian");

        emp.displayBasicInfo();

        //This is the original allowance initialized to 0
        System.out.println("\nThis is the original allowance");
        emp.allowance.displayAllowances();

        //This is the updated allowance showing the proper figures
        System.out.println("\nThis is the updated allowance");
        emp.allowance.updateAllowances(1000, 200, 300, 400, 500);

        System.out.println("\nUpdated allowances:");
        emp.allowance.displayAllowances();

        emp.vacation.updateVacationDays(30, 7);

        System.out.println("\nRemaining Vacation Days: " + emp.vacation.getRemainingVacationDays());
    }
}
