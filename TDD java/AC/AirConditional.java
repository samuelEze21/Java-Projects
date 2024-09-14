package AC;

public class AirConditional {
    private boolean isOn;
    private boolean isOff;
    private int temperature;
    private int finalTemperature;
    private int coolingLevel;



    public AirConditional() {
        this.isOn = false;
        this.isOff = false;
        this.temperature = 24;
        this.finalTemperature = 30;
        this.coolingLevel = 10;
    }

    public boolean turnOn() {
        this.isOn = true;
        return true;
     }

     public boolean turnOff() {
        this.isOff = true;
        return true;
     }

     public int getCoolingLevel() {
        this.coolingLevel = 10;
        return coolingLevel;
     }

     public int getTemperature() {
        return temperature;


     }

     public void increaseTemperature() {
        this.temperature += 1;
        coolingLevel -= 1;
    }

}


