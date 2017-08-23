package pmp.com.instapukkei.activities;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import pmp.com.instapukkei.utils.Constants;
import pmp.com.instapukkei.R;
import pmp.com.instapukkei.tabs.TabClassified;
import pmp.com.instapukkei.tabs.TabHomepage;
import pmp.com.instapukkei.tabs.TabShopping;
import pmp.com.instapukkei.tabs.TabTravel;


/**
 * Application runner.
 * Created by mgohain on 8/17/2017.
 */

public class HomepageActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the primary sections/tabs of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TabHomepage();
                case 1:
                    return new TabClassified();
                case 2:
                    return new TabShopping();
                case 3:
                    return new TabTravel();
                default:
                    return null;
            }
        }


        @Override
        public int getCount() {
            // number of tabs.
            return Constants.TAB_NUMBER;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return Constants.TAB_HOMEPAGE;
                case 1:
                    return Constants.TAB_CLASSIFIED;
                case 2:
                    return Constants.TAB_SHOPPING;
                case 3:
                    return Constants.TAB_TRAVEL;
                default:
                    return null;
            }
        }
    }
}
