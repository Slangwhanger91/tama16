package com.amitz.androgotchi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import wei.mark.standout.StandOutWindow;

public class MainActivity extends Activity {

    int x = 0, y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StandOutWindow.closeAll(this, SimpleWindow.class);
        StandOutWindow.show(this, SimpleWindow.class, StandOutWindow.SIMPLE_WINDOW_ID);


        findViewById(R.id.btnSetPosition)
        .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //StandOutWindow.setPosition(StandOutWindow.SIMPLE_WINDOW_ID, SimpleWindow.class, x, y);
                //StandOutWindow.setIncrementX(StandOutWindow.SIMPLE_WINDOW_ID, SimpleWindow.class, x);
                StandOutWindow.setIncrementY(StandOutWindow.SIMPLE_WINDOW_ID, SimpleWindow.class, y);
                x +=10;
                y += 10;

            }
        });

        //finish();

    }
}
