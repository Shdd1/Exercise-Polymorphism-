public class Cars implements Vehicle{
    private String model;
    private int days;
    private static final double DAILY_RATE = 50.0;

    public Cars(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days*DAILY_RATE;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Rental Days: " + DAILY_RATE);
        System.out.println("Total Rental Cost: $" + calculateRentalCost());
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", days=" + days +
                '}';
    }
}
