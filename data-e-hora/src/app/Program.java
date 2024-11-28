package app;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.Duration.*;

public class Program {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        Instant instant = Instant.now();

        LocalDate day = LocalDate.parse("2024-11-28");
        LocalDateTime dayHour = LocalDateTime.parse("2024-11-28T00:00:00");
        Instant instant2 = Instant.parse("2024-11-28T00:00:00Z");

        System.out.println(today);
        System.out.println(now);
        System.out.println(instant);
        System.out.println(day);
        System.out.println(dayHour);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        LocalDate date = LocalDate.parse("28/11/2024", formatter);

        System.out.println("Dia formato ISO: " + date.toString());
        System.out.println("Dia formatado: " + day.format(formatter));
        System.out.println("Dia formatado: " + formatter2.format(instant2));

        LocalDate pastWeekLocalDate = day.minusDays(7);
        LocalDate nextWeekLocalDate = pastWeekLocalDate.plusDays(7);

        System.out.println("past week date: " + pastWeekLocalDate);
        System.out.println("next week date: " + nextWeekLocalDate);

        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        System.out.println("past week instant: " + pastWeekInstant);

        Instant nextWeekInstant = pastWeekInstant.plus(7, ChronoUnit.DAYS);
        System.out.println("next week instant: " + nextWeekInstant);

        Duration duration = between(pastWeekInstant, nextWeekInstant);
        System.out.println("duration: " + duration.toDays());
    }
}
