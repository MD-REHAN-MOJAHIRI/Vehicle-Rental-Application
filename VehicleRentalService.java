import java.util.*;

public class VehicleRentalService {
    private List<Vehicle> vehicles = new ArrayList<>();

    public VehicleRentalService() {
        vehicles.add(new Vehicle("V101", "Honda City", "Car", 1500));
        vehicles.add(new Vehicle("V102", "Royal Enfield", "Bike", 700));
        vehicles.add(new Vehicle("V103", "Tata Ace", "Truck", 1800));
    }

    public void listAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.displayInfo();
            }
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }

    public void rentVehicle(Scanner sc) {
        listAvailableVehicles();
        System.out.print("\nEnter Vehicle ID to rent: ");
        String id = sc.next();
        Vehicle v = findVehicleById(id);

        if (v != null && v.isAvailable()) {
            System.out.print("Enter number of rental days: ");
            int days = sc.nextInt();
            if (days <= 0) {
                System.out.println("Invalid rental duration.");
                return;
            }

            double total = days * v.getRentPerDay();
            v.setAvailable(false);
            System.out.println("Vehicle rented successfully!");
            System.out.println("Total Bill: ₹" + total);
        } else {
            System.out.println("Invalid ID or Vehicle not available.");
        }
    }

    public void returnVehicle(Scanner sc) {
        System.out.print("\nEnter Vehicle ID to return: ");
        String id = sc.next();
        Vehicle v = findVehicleById(id);

        if (v != null && !v.isAvailable()) {
            v.setAvailable(true);
            System.out.println("Vehicle returned successfully!");
        } else {
            System.out.println("Invalid ID or Vehicle is already available.");
        }
    }

    public void showAllVehicles() {
        System.out.println("\nAll Vehicles:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
