import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        WeatherParser parser = new WeatherParser();
        parser.setParams();
        while (!parser.getWeatherDetails()) {
            parser.setParams();
        }
    }
}
