package bike;

public class Television {
    private String name = "Samsung";
    private boolean isOn;
    private int channel = 1;
    private int volume;

    public String getName() {
        return name;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setChannel(int channel) {
      if (isOn){  this.channel = channel;}
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        if (isOn && channel < 50) {
            channel = channel + 1;
        }
    }

    public void previousChannel() {
        if (isOn && channel > 1){
            channel = channel - 1;}
    }

    public void setVolume(int volume) {
        if (isOn){
        this.volume = volume;}
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (isOn && volume < 100){
            volume = volume + 5;}
    }

    public void decreaseVolume() {
        if (isOn && volume > 4){
            volume = volume - 5;
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
