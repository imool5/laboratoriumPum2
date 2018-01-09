package imiolekdaniel.pumlab2;

/**
 * Created by Daniel on 09.01.2018.
 */

public class Place {
    public String getPlace_name() {
        return place_name;
    }

    public Place(String place_name, int temperature, String information) {
        this.place_name = place_name;
        this.temperature = temperature;
        this.information = information;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String place_name;
    public int temperature;
    public String information;
}
