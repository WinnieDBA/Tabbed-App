package com.winnie.mifugo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.winnie.mifugo.ui.fragmentactivity2.FragmentActivity2Fragment;

public class FragmentActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FragmentActivity2Fragment.newInstance())
                    .commitNow();
        }
    }
}
