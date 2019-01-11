import org.json.simple.JSONObject;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {
    private void display(JSONObject data) {
        for (Object s : data.keySet()) {
            System.out.println(s + ": " + data.get(s));
        }
    }

    public void update(Observable o, Object arg) {
        display((JSONObject) arg);
    }
}
