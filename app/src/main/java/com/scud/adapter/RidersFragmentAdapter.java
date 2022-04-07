package com.scud.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.scud.fragments.CancelledFragment;
import com.scud.fragments.PastFragment;
import com.scud.fragments.UpcomingFragment;

public class RidersFragmentAdapter  extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public RidersFragmentAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                UpcomingFragment upcomingFragment = new UpcomingFragment();
                return upcomingFragment;
            case 1:
                PastFragment pastFragment = new PastFragment();
                return pastFragment;
            case 2:
                CancelledFragment cancelledFragment = new CancelledFragment();
                return cancelledFragment;
            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}

