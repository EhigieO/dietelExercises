package chapterThreeExercises;

public class Bike {
    private boolean isOn;
    private int speedInKmPerHour;
    private int currentGearNumber;

    public void setOn(boolean isOn) {

        this.isOn = isOn;

        if (this.isOn) {
            currentGearNumber = 1;
        } else {
            currentGearNumber = 0;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setSpeedInKmPerHour(int newSpeedInKmPerHour) {
        if (isOn) {
            speedInKmPerHour = newSpeedInKmPerHour;
        }
    }

    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }

    public int getCurrentGearNumber() {
        return currentGearNumber;
    }

    public void speedUp() {
        if (speedInKmPerHour >= 20 && speedInKmPerHour < 50) {
            currentGearNumber = 2;
        }
        if (speedInKmPerHour >= 50 && speedInKmPerHour < 80) {
            currentGearNumber = 3;
        }
        if (speedInKmPerHour >= 80 && speedInKmPerHour < 120) {
            currentGearNumber = 4;
        }
        speedInKmPerHour = speedInKmPerHour + currentGearNumber;
    }

    public void slowDown() {
        if (speedInKmPerHour >= 1 && speedInKmPerHour <= 19) {
            currentGearNumber = 1;
        }
        if (speedInKmPerHour >= 20 && speedInKmPerHour <= 49) {
            currentGearNumber = 2;
        }
        if (speedInKmPerHour >= 50 && speedInKmPerHour <= 79) {
            currentGearNumber = 3;
        }
        if (speedInKmPerHour >= 80 && speedInKmPerHour <= 120) {
            currentGearNumber = 4;
        }
        speedInKmPerHour = speedInKmPerHour - currentGearNumber;
    }
}


