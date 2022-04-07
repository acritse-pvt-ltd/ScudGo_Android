package com.scud.scudgo;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.scud.fragments.AccountFragment;
import com.scud.fragments.ChatFragment;
import com.scud.fragments.CourierFragment;
import com.scud.fragments.HomeFragment;
import com.scud.fragments.RidersFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<The_Slide_Items_Model_Class> listItems;
    private ViewPager page;
    private TabLayout tabLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView bottomNav = findViewById(R.id.b_nav_view);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.b_navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.b_navigation_rides:
                    selectedFragment = new RidersFragment();
                    break;
                case R.id.b_navigation_couriers:
                    selectedFragment = new CourierFragment();
                    break;
                case R.id.b_navigation_chat:
                    selectedFragment = new ChatFragment();
                    break;
                case R.id.b_navigation_account:
                    selectedFragment = new AccountFragment();
                    break;
            }
            // It will help to replace the
            // one fragment to other.
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit();
            return true;
        }
    };

/*
    public class The_slide_timer extends TimerTask {
        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (page.getCurrentItem() < listItems.size() - 1) {
                        page.setCurrentItem(page.getCurrentItem() + 1);
                    } else
                        page.setCurrentItem(0);
                }
            });
        }
    }
*/
}