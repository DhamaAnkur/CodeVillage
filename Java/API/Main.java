// Time and Date API

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;


public class Main {

    public static void main(String[] args) {
        Main date = new Main();
        date.testPeriod();

    }

    public static void testPeriod(){
        LocalDate date1 = LocalDate.now();
        System.out.println("Curren Date " + date1);
    }

}
