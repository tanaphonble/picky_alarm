package ayp.aug.pickyalarm;

import java.util.List;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class AlarmItemTable {

    private static AlarmItemTable instance;

    public static AlarmItemTable getInstance() {
        if (instance != null)
            return instance;
        else
            return new AlarmItemTable();
    }

}
