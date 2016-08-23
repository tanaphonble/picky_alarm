package ayp.aug.pickyalarm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class PickyAlarmFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public static PickyAlarmFragment newInstance() {

        Bundle args = new Bundle();

        PickyAlarmFragment fragment = new PickyAlarmFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.alarm_list_recycler_view, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.alarm_list_recycler_view);

        return v;
    }

    private class AlarmAdapter extends RecyclerView.Adapter<AlarmHolder>{

        @Override
        public AlarmHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(AlarmHolder holder, int position) {
            holder.bindAlarmItem();
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class AlarmHolder extends RecyclerView.ViewHolder{

        public AlarmHolder(View itemView) {
            super(itemView);
        }

        public void bindAlarmItem() {
        }
    }
}
