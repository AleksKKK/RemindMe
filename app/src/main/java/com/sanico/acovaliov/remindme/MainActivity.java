package com.sanico.acovaliov.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by acovaliov on 28-Dec-16.
 */

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initToolbar();
    }

    private void initToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.main_toolbar);
        toolbar.setTitle(R.string.app_name);

        toolbar.inflateMenu(R.menu.menu);
    }
}
