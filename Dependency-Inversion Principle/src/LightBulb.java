public abstract class LightBulb {
    private Boolean bulbStatus;
    public void setBulbStatus(Boolean status) {
        bulbStatus = status;
    }
    public Boolean getBulbStatus() {
        return bulbStatus;
    }
    public abstract void turn_on();

    public abstract void turn_off();

    public abstract void operate();
} 
