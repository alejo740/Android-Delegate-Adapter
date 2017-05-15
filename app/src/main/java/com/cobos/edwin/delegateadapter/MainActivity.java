package com.cobos.edwin.delegateadapter;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetupTabs();

    }

    private void SetupTabs() {
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

        //View view = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(2);
        //Drawable drw = view.getBackground();
        ViewGroup vg = ((ViewGroup) tabLayout.getChildAt(0));
        vg.getChildAt(0).setBackground(ContextCompat.getDrawable(this, R.drawable.tab_button_left));
        vg.getChildAt(tabLayout.getTabCount() - 1).setBackground(ContextCompat.getDrawable(this, R.drawable.tab_button_right));

        tabLayout.getTabAt(2).select();

        tabLayout.addOnTabSelectedListener(OnTabSelectedListener());
    }

    private TabLayout.OnTabSelectedListener OnTabSelectedListener() {
        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }
}
