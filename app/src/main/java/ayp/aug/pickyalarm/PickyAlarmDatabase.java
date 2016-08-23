package ayp.aug.pickyalarm;

import ayp.aug.pickyalarm.PickyAlarmDatabaseSchema.Table;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class PickyAlarmDatabase extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "picky_alarm_db";
    public static int VERSION = 1;

    public PickyAlarmDatabase(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE DATABASE "
                + Table.NAME + "("
                + Table.Column.ALARM_TEXT + ","
                + Table.Column.HOUR + ","
                + Table.Column.MINUTE + ","
                + Table.Column.STATUS + ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
