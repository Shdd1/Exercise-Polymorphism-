import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int carDays = scanner.nextInt();
                    Cars car = new Cars(carModel, carDays);
                    rentedVehicles.add(car);
                    System.out.println("Rental Details:");
                    car.displayDetails();
                    break;
                    //
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int bikeHours = scanner.nextInt();
                    Bike bike = new Bike(bikeHours,bikeBrand);
                    rentedVehicles.add(bike);
                    System.out.println("Rental Details:");
                    bike.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = scanner.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int truckWeeks = scanner.nextInt();
                    Trucks truck = new Trucks(truckWeeks, truckType);
                    rentedVehicles.add(truck);
                    System.out.println("Rental Details:");
                    truck.displayDetails();
                    break;
                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
