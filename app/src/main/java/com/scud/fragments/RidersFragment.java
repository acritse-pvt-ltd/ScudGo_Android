package com.scud.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.scud.adapter.CourierFragmentAdapter;
import com.scud.adapter.RidersFragmentAdapter;
import com.scud.scudgo.R;

import java.util.ArrayList;

public class RidersFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;
    ArrayList<String> tabList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.riders_fragment, container, false);
        //Initialize ID's
        viewPager = (ViewPager) view.findViewById(R.id.viewPager_serachF);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout_serachF);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabList.add("Upcoming");
        tabLayout.addTab(tabLayout.newTab().setText("Upcoming"));
        tabList.add("Past");
        tabLayout.addTab(tabLayout.newTab().setText("Past"));
        tabList.add("Cancelled");
        tabLayout.addTab(tabLayout.newTab().setText("Cancelled"));
        RidersFragmentAdapter adapter = new RidersFragmentAdapter(getContext(),getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }

}
