package com.example.elans.youtubeapidemo.activites;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.elans.youtubeapidemo.fragments.ListFragment;
import com.example.elans.youtubeapidemo.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();
        attachListFragment();
    }

    private void attachListFragment(){
        Fragment fragment = mFragmentManager.findFragmentByTag("LIST_FRAGMENT");
        if(fragment ==null){
            fragment = new ListFragment();
        }
        mFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment, "LIST_FRAGMENT").commit();
    }
}
