package pl.piatekd.osrsprices.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter {

    public static String timestampToDate(long timestamp) {
        Timestamp ts = new Timestamp(timestamp*1000L);
        Date date = new Date(ts.getTime());
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        return format.format(date);
    }

    public static long dateToTimestamp(Date date) {
        return 0;
    }
}
