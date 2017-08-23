package pmp.com.instapukkei.tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pmp.com.instapukkei.utils.Constants;
import pmp.com.instapukkei.R;
import pmp.com.instapukkei.activities.HomepageWebViewActivity;

/**
 * This class represents the homepage tab.<br />
 * Created by mgohain on 8/17/2017.
 */
public class TabHomepage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_homepage, container, false);
        process(rootView);
        return rootView;
    }
    private void process(View layoutView) {
        TextView homepageTextView = (TextView)layoutView.findViewById(R.id.section_label);
        homepageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink(v);
            }
        });
    }
    private void openLink(View view) {
        Intent intent = new Intent(getContext(), HomepageWebViewActivity.class);
        switch (view.getId()) {
            case R.id.section_label:
                intent.putExtra(Constants.KEY_URL, Constants.URL_AMAZON);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
