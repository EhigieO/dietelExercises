package bike;

public class AirCondition {
    private boolean isOn;
    private int temperature;
    private final String productName = "Samsung";

    public void setOn(boolean isOn) {
        this.isOn = isOn;

        if (this.isOn) {
            temperature = 16;
        }

        }

    public boolean isOn() {
        return isOn;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (isOn && temperature < 30){
        temperature = temperature + 1;}
    }

    public String getProductName() {
             return productName;
    }

    public void decreaseTemperature() {
       if (isOn && temperature >16){
            temperature = temperature - 1;}
    }
}
