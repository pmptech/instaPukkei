package pmp.com.instapukkei;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * This class represents the shopping tab.<br />
 * Created by mgohain on 8/17/2017.
 */
public class TabShopping extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_shopping, container, false);
    }
}