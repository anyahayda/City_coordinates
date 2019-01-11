import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coordinates {
    private long latitude;
    private long longitude;
    private Map<String, List<Long>> cities = new HashMap<>();

    public void resetMap() {
        cities.clear();
    }

    public void addCity(City city, long lat, long lon) {
        List<Long> coordinates = new ArrayList<>();
        coordinates.add(lat);
        coordinates.add(lon);

        cities.put(city.getName(), coordinates);
    }

    public Coordinates(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
