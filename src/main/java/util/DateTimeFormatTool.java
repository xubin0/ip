package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTool{

    private static final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

    public static String parseDateTime(String dateTimeStr) {
        if ("now".equalsIgnoreCase(dateTimeStr)) {
            LocalDate currentDate = LocalDate.now();
            return currentDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        } else {
            LocalDate date = LocalDate.parse(dateTimeStr, inputFormatter);
            return date.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        }
    }


    public static boolean isValidDateTimeFormat(String dateTimeStr) {
        try {
            parseDateTime(dateTimeStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}