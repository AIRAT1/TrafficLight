package ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TrafficLight {
    void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println(Constants.GREETING_1);
                System.out.println(Constants.GREETING_2);
                String time = reader.readLine();
                if (time.equals(Constants.EXIT)) return;
                System.out.println(String.format(Constants.RESULT_TEXT, getColor(Integer.parseInt(time))));
                System.out.println(Constants.SEPARATOR);
            } catch (Exception e) {
                System.out.println(Constants.ERROR_TEXT);
            }
        }
    }

    private static String getColor(int time) {
        String color = "";
        time = time % 10;
        if (time < 3) color = "green";
        else if (time < 5) color = "yellow";
        else if (time < 10) color = "red";
        return color;
    }
}
