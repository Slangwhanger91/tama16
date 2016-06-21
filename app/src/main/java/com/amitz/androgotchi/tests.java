package com.amitz.androgotchi;


import android.content.Context;

import wei.mark.standout.StandOutWindow;

public class tests {
    private static Context context;

    public static void setContext(Context c){
        context = c;
    }

    public static void amit(){
        StandOutWindow.closeAll(context, SimpleWindow.class);
        StandOutWindow.closeAll(context, MultiWindow.class);
        StandOutWindow.closeAll(context, WidgetsWindow.class);

        // show a MultiWindow, SimpleWindow

        StandOutWindow.show(context, SimpleWindow.class, StandOutWindow.DEFAULT_ID);
        StandOutWindow.show(context, MultiWindow.class, StandOutWindow.DEFAULT_ID);
        StandOutWindow.show(context, WidgetsWindow.class, StandOutWindow.DEFAULT_ID);
    }

    public static void mor(){

    }

    public static void petter(){

    }
}
