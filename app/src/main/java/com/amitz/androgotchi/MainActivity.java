package com.amitz.androgotchi;

import android.app.Activity;
import android.os.Bundle;

import wei.mark.standout.StandOutWindow;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StandOutWindow.closeAll(this, SimpleWindow.class);
        StandOutWindow.show(this, SimpleWindow.class, StandOutWindow.DEFAULT_ID);
        finish();

    }
}
//testing commit