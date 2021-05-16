package org.Marta;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOfBirthUtils {
    private LocalDate date;

    public DateOfBirthUtils(LocalDate date) {
        this.date = date;
    }

    public int getAge() {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public DayOfWeek getDayOfWeek() {
        return date.getDayOfWeek();
    }

    public int getWeek() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfWeekBasedYear());
    }
}
