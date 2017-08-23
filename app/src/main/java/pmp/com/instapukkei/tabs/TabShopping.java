package pmp.com.instapukkei.tabs;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import pmp.com.instapukkei.R;
import pmp.com.instapukkei.activities.ShoppingWebViewActivity;
import pmp.com.instapukkei.utils.Constants;
import pmp.com.instapukkei.utils.LogoIds;
import pmp.com.instapukkei.utils.LogoImageAdapter;

/**
 * This class represents the shopping tab.<br />
 * Created by mgohain on 8/17/2017.
 */
public class TabShopping extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_shopping, container, false);
        displayLogoGrid(rootView);
        return rootView;
    }

    private void displayLogoGrid(View layout) {
        GridView logoGridView = (GridView) layout.findViewById(R.id.logoGridView);
        logoGridView.setAdapter(new LogoImageAdapter(getActivity().getApplicationContext(),
                LogoIds.SHOPPING_SITE_LOGOS));
        logoGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent(getContext(), ShoppingWebViewActivity.class);
                switch ((int)id) {
                    case R.drawable.amazon :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_AMAZON);
                        startActivity(intent);
                        break;
                    case R.drawable.myntra :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_MYNTRA);
                        startActivity(intent);
                        break;
                    case R.drawable.flipkart :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_FLIPKART);
                        startActivity(intent);
                        break;
                    case R.drawable.jabong :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_JABONG);
                        startActivity(intent);
                        break;
                    case R.drawable.abof :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_ABOF);
                        startActivity(intent);
                        break;
                    case R.drawable.voonik :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_VOONIK);
                        startActivity(intent);
                        break;
                    case R.drawable.shopclues :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_SHOPCLUES);
                        startActivity(intent);
                        break;
                    case R.drawable.snapdeal :
                        intent.putExtra(Constants.KEY_URL, Constants.URL_SNAPDEAL);
                        startActivity(intent);
                        break;
                    default:
                        return;
                }
                //Toast.makeText(getContext(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
