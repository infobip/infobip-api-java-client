package infobip.api.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: pducic
 * Since: 21/10/15
 */
public class FormattedDate {
    private static final ThreadLocal<DateFormat> DF = new ThreadLocal<DateFormat>() {
        @Override
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        }
    };

    private final Date date;

    public FormattedDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return DF.get().format(date);
    }
}
