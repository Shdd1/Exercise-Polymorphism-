public class Trucks implements Vehicle{
   private int week ;
   private String type;
   private static final double weekly_rate = 500.0;


    public Trucks(int week, String type) {
        this.week = week;
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calculateRentalCost() {
        return week*weekly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Type: " +type);
        System.out.println("Rental Week: " + weekly_rate);
        System.out.println("Total Rental Cost: $" + calculateRentalCost());
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "week=" + week +
                ", type='" + type + '\'' +
                '}';
    }
}
