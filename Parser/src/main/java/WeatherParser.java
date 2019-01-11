import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Observable;

public class WeatherParser extends Observable {
    private static StringBuilder request;

    WeatherParser() {
        request = new StringBuilder();
        addObserver(new Display());
    }

    public void setParams() {
        if (request.length() != 0) {
            request.delete(0, request.length());
        }

        System.out.println("Please enter the city name");
        String input = Main.scanner.nextLine();
        String link = "http://api.apixu.com/v1/current.json?key=f6da3a783d34446f8f4120423180410&";
        request.append(link);
        request.append("q=");
        request.append(input);
    }

    public boolean getWeatherDetails() {
        URL url;
        BufferedReader bufferedReader;
        JSONParser jsonParser = new JSONParser();
        JSONObject data;
        try {
            url = new URL(request.toString());
            bufferedReader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            data = (JSONObject) jsonParser.parse(bufferedReader);

            City city = new Gson().fromJson(String.valueOf(data), City.class);

            System.out.println(city + "\n");
        } catch (IOException e) {
            System.out.println("Sorry we did not support this city");
            return false;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }

        setChanged();
        notifyObservers(data);
        return true;
    }
}
