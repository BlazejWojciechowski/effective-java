package simplePrograms;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExercises {
    public static void main(String[] args) {
        Date today = new Date();

        System.out.println("Today is " + today);

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE dd MM yyyy HH:mm:ss a");

        System.out.println(formatter.format(today));
    }
}
