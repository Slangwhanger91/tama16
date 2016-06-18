package com.amitz.androgotchi;

import android.app.Activity;
import android.os.Bundle;

import wei.mark.standout.StandOutWindow;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StandOutWindow.closeAll(this, SimpleWindow.class);
        StandOutWindow.closeAll(this, MultiWindow.class);
        StandOutWindow.closeAll(this, WidgetsWindow.class);

        // show a MultiWindow, SimpleWindow

        StandOutWindow.show(this, SimpleWindow.class, StandOutWindow.DEFAULT_ID);
        StandOutWindow.show(this, MultiWindow.class, StandOutWindow.DEFAULT_ID);
        StandOutWindow.show(this, WidgetsWindow.class, StandOutWindow.DEFAULT_ID);



        // show a MostBasicWindow. It is commented out because it does not
        // support closing.
        /*
        * StandOutWindow.show(this, StandOutMostBasicWindow.class, StandOutWindow.DEFAULT_ID);
        */


        finish();

    }
}