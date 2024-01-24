public class App {
    public static void main(String[] args) throws Exception {
        LightBulb switch1 = new Switch() ;
        System.out.print("turn_on Function : ");
        switch1.turn_on();
        System.out.print("operate Function : ");
        switch1.operate();
        System.out.println(" ");
    
        System.out.print("turn_off Function : ");
        switch1.turn_off();
        System.out.print("operate Function : ");
        switch1.operate();
    }
}
