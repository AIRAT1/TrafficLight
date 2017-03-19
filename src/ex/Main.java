package ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static final String GREETING_1 = "Enter time after start";
    public static final String GREETING_2 = "Write \"exit\" to exit";
    public static final String EXIT = "exit";
    public static final String RESULT_TEXT = "Now is %s color";
    public static final String SEPARATOR = "~~~~~~~~~~~~~~~~~~~~~~~";
    public static final String ERROR_TEXT = "You must enter only integer value";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println(GREETING_1);
                System.out.println(GREETING_2);
                String time = reader.readLine();
                if (time.equals(EXIT)) return;
                System.out.println(String.format(RESULT_TEXT, getColor(Integer.parseInt(time))));
                System.out.println(SEPARATOR);
            } catch (Exception e) {
                System.out.println(ERROR_TEXT);
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
