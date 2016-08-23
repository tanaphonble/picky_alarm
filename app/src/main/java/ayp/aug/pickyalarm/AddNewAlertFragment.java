package ayp.aug.pickyalarm;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class AddNewAlertFragment extends Fragment {
    public static AddNewAlertFragment newInstance() {
        
        Bundle args = new Bundle();
        
        AddNewAlertFragment fragment = new AddNewAlertFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
