public class Switch extends LightBulb{
    @Override
    public void turn_on() {
        setBulbStatus(true);
        System.out.println("Light is on");
    }
    @Override
    public void turn_off() {
        setBulbStatus(false);
        System.out.println("Light is off");
    }
    public void operate(){
        if(getBulbStatus()){
            turn_off();
        }
        else{
            turn_on();
        }
    }
}
