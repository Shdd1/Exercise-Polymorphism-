public class Bike implements Vehicle{
    private int hour ;
    private String brand;
    private static final double hourly_rate=10;
    public Bike(int hour, String brand) {
        this.hour = hour;
        this.brand = brand;
    }

    public Bike(String bikeBrand, int bikeHours) {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double calculateRentalCost() {
        return hour*hourly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Brand: " +brand);
        System.out.println("Rental Hour: " + hourly_rate);
        System.out.println("Total Rental Cost: $" + calculateRentalCost());
    }

    @Override
    public String toString() {
        return "Bike{" +
                "hour=" + hour +
                ", brand='" + brand + '\'' +
                '}';
    }
}
