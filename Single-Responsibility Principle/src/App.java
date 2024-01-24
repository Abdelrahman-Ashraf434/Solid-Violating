public class App {
    public static void main(String[] args) throws Exception {
        Order order = new Order();
        order.calculate_total();
        System.out.println(" ");
        Payment payment = new Payment();
        payment.process_payment();
        System.out.println(" ");
        Shipping shipping = new Shipping();
        shipping.ship_order();
    }
}
