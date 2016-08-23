package ayp.aug.pickyalarm;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class PickyAlarmDatabaseSchema {
    public static class Table{
        public static String NAME = "alarm";
        public static class Column {
            public static String ALARM_TEXT = "alarm_text";
            public static String HOUR = "hour";
            public static String MINUTE = "minute";
            public static String STATUS = "status";
        }
    }
}
