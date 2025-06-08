import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleRentalService rentalService = new VehicleRentalService();
        int choice;

        do {
            System.out.println("\n====== Vehicle Rental System ======");
            System.out.println("1. List Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Show All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next(); // skip invalid input
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    rentalService.listAvailableVehicles();
                    break;
                case 2:
                    rentalService.rentVehicle(sc);
                    break;
                case 3:
                    rentalService.returnVehicle(sc);
                    break;
                case 4:
                    rentalService.showAllVehicles();
                    break;
                case 5:
                    System.out.println("Exiting system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 5.");
            }
        } while (choice != 5);

        sc.close();
    }
}
