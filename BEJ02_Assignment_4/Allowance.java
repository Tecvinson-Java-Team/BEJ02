public class Allowance {

    //Initializing all the variables for Allowance class to private
    private int basic;
    private int transport;
    private int wardrobe;
    private int education;
    private int feeding;

    //This is the Allowance constructor, it instantiates all variables to 0
    public Allowance() {
        this.basic = 0;
        this.transport = 0;
        this.wardrobe = 0;
        this.education = 0;
        this.feeding = 0;
    }

    //This is the method for display Allowances, it shows original figures
    public void displayAllowances() {
        System.out.println("Basic Allowance: " + basic);
        System.out.println("Transportation Allowance: " + transport);
        System.out.println("Wardrobe Allowance: " + wardrobe);
        System.out.println("Education Allowance: " + education);
        System.out.println("Feeding Allowance: " + feeding);
    }

    //This is the method to update Allowances, it shows updated figures
    public void updateAllowances(int basic, int transport, int wardrobe, int education, int feeding) {
        this.basic = basic;
        this.transport = transport;
        this.wardrobe = wardrobe;
        this.education = education;
        this.feeding = feeding;
    }
}