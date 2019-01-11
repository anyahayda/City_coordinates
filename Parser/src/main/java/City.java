public class City {
    private float feelslikeC;
    private float uv;
    private String lastUpdated;
    private float windDegree;
    private boolean isDay;
    private float precipIn;
    private String windDir;
    private float tempC;
    private float pressureIn;
    private int cloud;
    private float windKph;
    private int humidity;
    private float pressureMb;
    private float visKm;
    private String name;
    private String localTime;
    private String country;

    public City(float feelslikeC, float uv, String lastUpdated, float windDegree, boolean isDay, float precipIn, String windDir, float tempC, float pressureIn, int cloud, float windKph, int humidity, float pressureMb, float visKm, String name, String localTime, String country) {
        setFeelslikeC(feelslikeC);
        setUv(uv);
        setLastUpdated(lastUpdated);
        setWindDegree(windDegree);
        setDay(isDay);
        setPrecipIn(precipIn);
        setWindDir(windDir);
        setTempC(tempC);
        setPressureIn(pressureIn);
        setCloud(cloud);
        setWindKph(windKph);
        setHumidity(humidity);
        setPressureMb(pressureMb);
        setVisKm(visKm);
        setName(name);
        setLocalTime(localTime);
        setCountry(country);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getLocalTime() {
        return localTime;
    }

    private void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    private String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    private float getFeelslikeC() {
        return feelslikeC;
    }

    private void setFeelslikeC(float feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    private float getUv() {
        return uv;
    }

    private void setUv(float uv) {
        this.uv = uv;
    }

    private String getLastUpdated() {
        return lastUpdated;
    }

    private void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    private float getWindDegree() {
        return windDegree;
    }

    private void setWindDegree(float windDegree) {
        this.windDegree = windDegree;
    }

    private boolean isDay() {
        return isDay;
    }

    private void setDay(boolean day) {
        isDay = day;
    }

    private float getPrecipIn() {
        return precipIn;
    }

    private void setPrecipIn(float precipIn) {
        this.precipIn = precipIn;
    }

    private String getWindDir() {
        return windDir;
    }

    private void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    private float getTempC() {
        return tempC;
    }

    private void setTempC(float tempC) {
        this.tempC = tempC;
    }

    private float getPressureIn() {
        return pressureIn;
    }

    private void setPressureIn(float pressureIn) {
        this.pressureIn = pressureIn;
    }

    private int getCloud() {
        return cloud;
    }

    private void setCloud(int cloud) {
        this.cloud = cloud;
    }

    private float getWindKph() {
        return windKph;
    }

    private void setWindKph(float windKph) {
        this.windKph = windKph;
    }

    private int getHumidity() {
        return humidity;
    }

    private void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    private float getPressureMb() {
        return pressureMb;
    }

    private void setPressureMb(float pressureMb) {
        this.pressureMb = pressureMb;
    }

    private float getVisKm() {
        return visKm;
    }

    private void setVisKm(float visKm) {
        this.visKm = visKm;
    }

    @Override
    public String toString() {
        return getName() +":\n" +
                "feels like in C = " + getFeelslikeC() +
                "\n uv = " + getUv() +
                "\n lastUpdated = '" + getLastUpdated() + '\'' +
                "\n windDegree = " + getWindDegree() +
                "\n isDay = " + isDay() +
                "\n precipIn = " + getPrecipIn() +
                "\n windDir = '" + getWindDir() + '\'' +
                "\n temp in C = " + getTempC() +
                "\n pressureIn = " + getPressureIn() +
                "\n cloud = " + getCloud() +
                "\n windKph = " + getWindKph() +
                "\n humidity = " + getHumidity() +
                "\n pressureMb = " + getPressureMb() +
                "\n visKm = " + getVisKm() +
                "\n localTime='" + getLocalTime() + '\'' +
                "\n country='" + getCountry() + '\'' +
                '}';
    }
}
