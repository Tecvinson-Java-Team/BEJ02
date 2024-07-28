public class Vacation {

    //Initializing the variables for Vacation class to private
    private int totalVacationDays;
    private int usedVacationDays;

    //Initial values of vacation variables set to 0
    public Vacation() {
        this.totalVacationDays = 0;
        this.usedVacationDays = 0;
    }

    //Updated values of vacation variables
    public void updateVacationDays(int totalVacationDays, int usedVacationDays) {
        this.totalVacationDays = totalVacationDays;
        this.usedVacationDays = usedVacationDays;
    }

    //This method will return the remaining vacation days left
    public int getRemainingVacationDays() {
        return totalVacationDays - usedVacationDays;
    }
}