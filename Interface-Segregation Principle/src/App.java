public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Car();
        vehicle.drive();
        System.out.println("  ");
        AbstractVehicleController controller = new Motorcycle();
        controller.start();
        controller.stop();
    }
}
