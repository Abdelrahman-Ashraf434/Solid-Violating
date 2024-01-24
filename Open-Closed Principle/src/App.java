interface Payment {
    public String pay();
}
public class App {
    public static void main(String[] args) throws Exception {
        Client c1 = new Client();
        c1.payment_process(new Creditcard());
    }
}
