package com.amitz.androgotchi;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import wei.mark.standout.StandOutWindow;
import wei.mark.standout.constants.StandOutFlags;
import wei.mark.standout.ui.Window;

public class SimpleWindow extends StandOutWindow {
	int r, g, b, a; // 'global' per service, not per window
	int x, y; // same

	@Override
	public String getAppName() {
		return "SimpleWindow";
	}

	@Override
	public int getAppIcon() {
		return android.R.drawable.ic_menu_close_clear_cancel;
	}

	@Override
	public void createAndAttachView(int id, FrameLayout frame) {
		// create a new layout from body.xml
		LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.simple, frame, true);
		Button button = (Button) view.findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Window window = getWindow(0);
				window.setBackgroundColor(Color.parseColor(String.format("#%02X%02X%02X%02X", a & 0xff, r & 0xff, g & 0xff, b & 0xff)));
				window.edit().setPosition(x, y);
				window.edit().commit();
				// & 0xff to never overflow from max two hex characters in Color string(s)
				a += 33;
				x += 10;
				System.out.printf("BG=#%02X%02X%02X%02X\n", a & 0xff, r & 0xff, g & 0xff, b & 0xff);
				System.out.println(window.getLayoutParams());
			}

		});
	}

	// the window will be centered
	@Override
	public StandOutLayoutParams getParams(int id, Window window) {
		return new StandOutLayoutParams(id, 250, 300,
				StandOutLayoutParams.CENTER, StandOutLayoutParams.CENTER);
	}

	// move the window by dragging the view
	@Override
	public int getFlags(int id) {
		return super.getFlags(id) | StandOutFlags.FLAG_BODY_MOVE_ENABLE
				| StandOutFlags.FLAG_WINDOW_FOCUSABLE_DISABLE;
	}

	@Override
	public String getPersistentNotificationMessage(int id) {
		return "Click to close the SimpleWindow";
	}

	@Override
	public Intent getPersistentNotificationIntent(int id) {
		return StandOutWindow.getCloseIntent(this, SimpleWindow.class, id);
	}
}
