public class Vehicle {
    private String vehicleId;
    private String model;
    private String type;
    private double rentPerDay;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, String type, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.type = type;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }

    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public double getRentPerDay() { return rentPerDay; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public void displayInfo() {
        System.out.println(vehicleId + " | " + model + " | " + type + " | ₹" + rentPerDay + " | " + (isAvailable ? "Available" : "Rented"));
    }
}
