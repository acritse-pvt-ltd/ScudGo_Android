package com.scud.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.scud.fragments.CancelledFragment;
import com.scud.fragments.DeliveredFragment;
import com.scud.fragments.UpcomingFragment;

import java.util.ArrayList;

public class CourierFragmentAdapter extends FragmentPagerAdapter {

    Context myContext;
    ArrayList<String> tabList;

    public CourierFragmentAdapter(Context context, FragmentManager fragmentManager, ArrayList<String> tabCount) {
        super(fragmentManager);
        myContext = context;
        tabList = tabCount;

    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (tabList.get(position)) {
            case "Upcoming":
                UpcomingFragment upcomingFragment = new UpcomingFragment();
                return upcomingFragment;
            case "Delivered":
                DeliveredFragment deliveredFragment = new DeliveredFragment();
                return deliveredFragment;
            case "Cancelled":
                CancelledFragment cancelledFragment = new CancelledFragment();
                return cancelledFragment;

            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return tabList.size();
    }
}
