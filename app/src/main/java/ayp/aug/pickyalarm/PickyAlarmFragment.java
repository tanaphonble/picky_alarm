package ayp.aug.pickyalarm;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class PickyAlarmFragment extends Fragment {

    public static PickyAlarmFragment newInstance() {

        Bundle args = new Bundle();

        PickyAlarmFragment fragment = new PickyAlarmFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
