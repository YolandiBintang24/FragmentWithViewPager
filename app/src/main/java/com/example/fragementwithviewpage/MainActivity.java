package com.example.fragementwithviewpage;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements CHAT.SendMessage{

    ViewPagerAdapter vpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager)findViewById(R.id.viewPager);
        vpAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(vpAdapter);
        TabLayout tabs =(TabLayout)findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(vp);
    }

    @Override
    public void sendData(String message) {
        String tag = "android:switcher:" + R.id.viewPager + ":" + 1;
        STATUS f = (STATUS) getSupportFragmentManager().findFragmentByTag(tag);
        f.displayReceivedData(message);
    }

}
