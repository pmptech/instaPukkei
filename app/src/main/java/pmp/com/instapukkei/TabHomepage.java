package pmp.com.instapukkei;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This class represents the homepage tab.<br />
 * Created by mgohain on 8/17/2017.
 */
public class TabHomepage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_homepage, container, false);
        showToast(rootView);
        return rootView;
    }
    private void showToast(View layoutView) {
        TextView homepageTextView = (TextView)layoutView.findViewById(R.id.section_label);
        homepageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You are at the homepage!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
