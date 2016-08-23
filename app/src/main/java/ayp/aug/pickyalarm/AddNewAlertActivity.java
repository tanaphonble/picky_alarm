package ayp.aug.pickyalarm;

import android.support.v4.app.Fragment;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class AddNewAlertActivity extends SingleFragmentActivity {
    @Override
    protected Fragment onCreateFragment() {
        return AddNewAlertFragment.newInstance();
    }
}
