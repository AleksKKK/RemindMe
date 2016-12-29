package com.sanico.acovaliov.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * Created by acovaliov on 28-Dec-16.
 */

public class MainActivity extends Activity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initToolbar();
    }

    private void initToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        toolbar.inflateMenu(R.menu.menu);
    }
}
