package com.amitz.androgotchi;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tests.setContext(getApplicationContext());

        //Testing:
        //Keep this commented before committing!
        //======================================
        //tests.amit();
        //tests.petter();
        //tests.mor();
        //======================================


        // show a MostBasicWindow. It is commented out because it does not
        // support closing.
        /*
        * StandOutWindow.show(this, StandOutMostBasicWindow.class, StandOutWindow.DEFAULT_ID);
        */

        finish();
    }
}


