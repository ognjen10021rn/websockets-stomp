package rs.raf.ostojanovic10021rn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemUtils {
    private static final String PATTERN = "HH:mm:ss";

    public static String getCurrentTimeStamp(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);
        return LocalDateTime.now().format(formatter);
    }
}
