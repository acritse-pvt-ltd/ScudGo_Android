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
import com.scud.scudgo.R;
import com.scud.scudgo.The_Slide_Items_Model_Class;
import com.scud.scudgo.The_Slide_items_Pager_Adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    private List<The_Slide_Items_Model_Class> listItems;
    private ViewPager page;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        page = view.findViewById(R.id.my_pager);
        tabLayout = view.findViewById(R.id.my_tablayout);


        listItems = new ArrayList<>();
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.banner1, "Slider 1 Title"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.banner1, "Slider 2 Title"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.banner1, "Slider 3 Title"));

        The_Slide_items_Pager_Adapter itemsPager_adapter = new The_Slide_items_Pager_Adapter(getActivity(), listItems);
        page.setAdapter(itemsPager_adapter);

        // The_slide_timer
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new The_slide_timer(), 2000, 3000);
        tabLayout.setupWithViewPager(page, true);
        return view;
    }

    public class The_slide_timer extends TimerTask {
        @Override
        public void run() {
            try {
              getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (page.getCurrentItem() < listItems.size() - 1) {
                            page.setCurrentItem(page.getCurrentItem() + 1);
                        } else
                            page.setCurrentItem(0);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
